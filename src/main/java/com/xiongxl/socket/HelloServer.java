package com.xiongxl.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author xiongxl
 * @version $Id: HelloServer.java, v 0.1 2019-04-18 上午9:14 xiongxl Exp $$
 */
public class HelloServer {

    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = null;
        try {
            // 实例化一个服务器端的Socket链接
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            System.err.println("Could not listen on port : 9999");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            // 用于接受来自客户端的链接
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accepted failed");
            System.exit(1);
        }
        // 客户端有数据，就向客户端打印数据
        System.out.println("Hello World");
        clientSocket.close();
        serverSocket.close();
    }
}
