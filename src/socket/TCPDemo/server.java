package socket.TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1、修改socket中的server和client,使得server能够向client发送数据。
 * 2、改造server，将其变成一个能够持续接收和发送数据的server
 */
public class server {
    public static void main(String[] args) throws Exception {
        //监听制定的端口
        int port = 55533;
        ServerSocket server = new ServerSocket(port);

        //server讲一直等待连接的到来
        System.out.println("server将一直等待链接的到来");
        Socket socket = server.accept();
        //建立链接后，从socket中获取输入流，并建立缓冲区进行读取
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = inputStream.read(bytes)) != -1) {
            //注意指定编码格式，发送和接受方一定要统一，建议使用UTF-8
            sb.append(new String(bytes, 0, len, "UTF-8"));
        }
        System.out.println("get message from client: " + sb);
        inputStream.close();
        socket.close();
        server.close();
    }
}
