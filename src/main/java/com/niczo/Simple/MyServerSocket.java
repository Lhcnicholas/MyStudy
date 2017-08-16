package com.niczo.Simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * DES:
 * PROJECT:MyStudy
 * Author:Li Nic
 * DATE:2017/8/1
 */
public class MyServerSocket {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(8080);
            Socket socket = serverSocket.accept();
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = is.readLine();
            System.out.println("Received from client: " + line);

            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            pw.println("Received data: " + line);
            pw.flush();
            pw.close();
            socket.close();
            serverSocket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
