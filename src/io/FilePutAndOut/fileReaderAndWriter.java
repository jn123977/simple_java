package io.FilePutAndOut;

import java.io.*;

/**
 * 字符流
 */
public class fileReaderAndWriter {

    public static void main(String[] args) {
        getOpenButton();
        getCloseButton();

    }
    /**
     * 写入文件
     */
    public static void getOpenButton() {
        File file=new File("world.txt");
        try {

            FileWriter out = new FileWriter(file);
            String s = "我是一个快乐的天使!";
            out.write(s);
            out.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    /**
     *  读取文件
     */
    public static void getCloseButton(){
        File file=new File("world.txt");
        try {
            FileReader in = new FileReader(file);
            char[] byt = new char[1024];
            int len = in.read(byt);
            System.out.println(new String(byt,0,len));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
