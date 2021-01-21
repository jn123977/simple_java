package io.FilePutAndOut;

import java.io.*;

/**
 * 字节流
 */
public class InAndOutputStream {
    public static void main(String[] args) {
        File file=new File("world.txt");
        try {
            FileOutputStream fos=new FileOutputStream(file);
            byte  bytes[]="我有一只小毛驴，我从来也不骑!".getBytes();
            fos.write(bytes);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis=new FileInputStream(file);
            byte[] bytes=new byte[1024];
            int len=fis.read(bytes);
            //System.out.println(len);
            System.out.println("文件中的信息是："+new String(bytes,0,len));
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
