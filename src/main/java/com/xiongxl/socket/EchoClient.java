package com.xiongxl.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 *
 * @author xiongxl
 * @version $Id: EchoClient.java, v 0.1 2019-04-18 上午10:25 xiongxl Exp $$
 */
public class EchoClient {
    public static void main(String[] args) throws IOException{
        Socket socket = null;
        PrintWriter printWriter = null;
        BufferedReader br = null;
        try {
            socket = new Socket("localhost", 1111);
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host:localhost");
            System.exit(1);
        }
        System.out.println(br.readLine());
        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        // 将客户端Socket输入流（即服务端Socket的输出流）输出到标准输出上
        while ((userInput = stdIn.readLine()) != null) {
            printWriter.println(userInput);
            System.out.println(br.readLine());
        }
        // 同样的，将该关闭的资源关闭
        printWriter.close();
        br.close();
        socket.close();
    }
}
