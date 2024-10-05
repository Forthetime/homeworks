package ru.otus.java.homework13.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888);
             PingClient client = new PingClient(socket)
        ) {
            System.out.println(client.read());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Scanner scanner = new Scanner(System.in);
        String userInputNumbers = scanner.nextLine();
        try (Socket socket2 = new Socket("localhost", 8888);
             PingClient client2 = new PingClient(socket2)
        ) {
            client2.send(userInputNumbers.toString());
            System.out.println(client2.read());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}