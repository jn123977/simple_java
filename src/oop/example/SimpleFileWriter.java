package oop.example;

import java.io.*;

public class SimpleFileWriter {

    public static void writeFileOne(String fileName, String content) {
        File file = new File(fileName);
        OutputStream out = null;
        try {
            System.out.println("以字节为单位写入文件内容，一次写一个字节：");
            // 底层是逐个字节写入
            out = new FileOutputStream(file);
            out.write(content.getBytes());
//            out.flush();
//            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static void writeFileBuffer(String fileName, String content) {
        File file = new File(fileName);
        OutputStream out = null;
        BufferedOutputStream bos = null;
        try {
            System.out.println("以字节为单位写入文件内容，带缓冲的：");
            // 底层是逐个字节写入
            out = new FileOutputStream(file);
            bos = new BufferedOutputStream(out);
            bos.write(content.getBytes());
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static void writeFileChar(String fileName, String content) {
        File file = new File(fileName);
        BufferedWriter bw = null;
        try {
            System.out.println("以字符为单位读取文件内容，一次读一整行：");
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(content);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e1) {
                }
            }
        }
    }


    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            if (i != 0 && i % 10 == 0) {
                s.append("\n");
            }
            s.append("1");
        }
//        writeFileOne("src/nomal_io.txt", s.toString());
//        writeFileBuffer("src/nomal_io.txt", s.toString());
        writeFileChar("src/nomal_io.txt", s.toString());
    }
}
