package socket.TCPDemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws Exception {
        //需要链接的服务器IP地址和端口
        String host = "127.0.0.1";
        int port = 55533;
        //与服务器建立链接
        Socket socket = new Socket(host, port);
        //建立链接后获取输出流
        OutputStream outputStream = socket.getOutputStream();
        String message = "hello";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
        //通用shutdownOutput高速服务器已经发送完数据，后续只能接受数据
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = inputStream.read(bytes)) != -1) {
            //主意指定编码格式，发送方和接受方 一定要统一，建议使用UTF-8
            sb.append(new String(bytes, 0, len, "UTF-8"));
        }
        System.out.println("get message from server: " + sb);

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
