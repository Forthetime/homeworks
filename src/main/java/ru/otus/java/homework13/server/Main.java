package ru.otus.java.homework13.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket clientCccept = serverSocket.accept();
            System.out.println("Client connected!");
            readRequest(clientCccept);
            Socket clientCccept2 = serverSocket.accept();
            readNumbers(clientCccept2);
        }
    }

    private static void readRequest(Socket socket) throws IOException {
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        String str2 = "Доступные операции +,-,*,/. Введите через пробел 2 числа и операцию";
        output.writeUTF(str2);
        output.flush();
    }

    private static void readNumbers(Socket socket) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        String str3 = input.readUTF();
        System.out.println("User input:" + str3);
        String array[] = str3.split(" ");
        float firstNumber = Float.parseFloat(array[0]);
        float secondNumber = Float.parseFloat(array[1]);
        char operation = array[2].charAt(0);
        System.out.println(firstNumber + ", " + secondNumber + ", " + operation);
        String result;
        if (operation == '+') {
            result = Float.toString(firstNumber + secondNumber);
        } else if (operation == '-') {
            result = Float.toString(firstNumber - secondNumber);
        } else if (operation == '*') {
            result = Float.toString(firstNumber * secondNumber);
        } else if (operation == '/') {
            result = Float.toString(firstNumber / secondNumber);
        } else {
            result = "Неизвестная операция";
        }
        System.out.println(result);
        String resultForClient = "Результат равен: " + result;
        output.writeUTF(resultForClient);
        output.flush();
    }
}