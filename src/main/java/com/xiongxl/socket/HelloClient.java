package com.xiongxl.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author xiongxl
 * @version $Id: HelloClient.java, v 0.1 2019-04-18 上午9:28 xiongxl Exp $$
 */
public class HelloClient {
    public static void main(String[] args) throws IOException{
        Socket socket = null;
        BufferedReader br = null;
        // 下面这段程序，用于将输入输出流和Socket相关联
        try {
            socket = new Socket("localhost", 9999);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host:localhost");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Could not get I/O for the Connection");
            System.exit(1);
        }
        System.out.println(br.readLine());
        br.close();
        socket.close();
    }
}
