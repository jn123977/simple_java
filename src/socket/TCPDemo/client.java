
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
        /** shutdownOutput();
         * 1、在客户端或者服务端通过socket.shutdownOutput()都是单向关闭的，
         * 即关闭客户端的输出流并不会关闭服务端的输出流，所以是一种单方向的关闭流；
         *
         * 2、通过socket.shutdownOutput()关闭输出流，但socket仍然是连接状态，连接并未关闭
         *
         * 3、如果直接关闭输入或者输出流，即：in.close()或者out.close()，会直接关闭socket
         *
         *
         */

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
