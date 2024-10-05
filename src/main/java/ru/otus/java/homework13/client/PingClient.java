package ru.otus.java.homework13.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class PingClient implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public PingClient(Socket socket) throws IOException {
        this.inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        this.outputStream = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
    }

    public void send(String string) throws IOException {
        outputStream.writeUTF(string);
        outputStream.flush();
    }

    public String read() throws IOException {
        String result = inputStream.readUTF();
        return result;
    }


    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
