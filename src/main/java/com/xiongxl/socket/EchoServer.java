package com.xiongxl.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 改进版本的Socket
 * @author xiongxl
 * @version $Id: EchoServer.java, v 0.1 2019-04-18 上午9:43 xiongxl Exp $$
 */
public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        try {
            // 实例化监听端口
            serverSocket = new ServerSocket(1111);
        } catch (IOException e) {
            System.err.println("Could not listen on port : 1111");
            System.exit(1);
        }
        Socket incoming = null;
        while (true) {
            incoming = serverSocket.accept();
            printWriter = new PrintWriter(incoming.getOutputStream(), true);
            // 先将字节流通过InputStreamReader转换为字符流，之后将字符流放入缓冲之中
            bufferedReader = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
            // 提示信息
            printWriter.println("Hello!...");
            printWriter.println("Enter BYE to exit!");
            printWriter.flush();
            // 没有异常则不断循环
            while (true) {
                // 只有当用户输入时才返回数据
                String str = bufferedReader.readLine();
                // 当用户连接断掉时会返回空值 null
                if (str == null) {
                    // 退出循环
                    break;
                } else {
                    // 对用户输入的字符串加前缀 Echo 并将此信息打印到客户端
                    printWriter.write("Echo:" + str);
                    printWriter.flush();
                    // 退出命令，equalsIgnoreCase() 是不区分大小写的
                    if ("BYE".equalsIgnoreCase(str.trim())) {
                        break;
                    }
                }
            }
            // 该close的资源都close掉
            printWriter.close();
            bufferedReader.close();
            incoming.close();
            serverSocket.close();
        }
    }
}
