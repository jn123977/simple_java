package io.FilePutAndOut;

import java.io.*;


/**
 * 带缓存的输入输出
 *  字节流
 *      >BufferedInputStream
 *      >BufferedOutputStream
 *  字符流
 *      >BufferedWriter
 *      >BufferedReader
 *
 * 注：在默认的构造方法中默认是一个32字节的缓存流
 */
public class BufferInAndOut {
    public static void main(String[] args) {
        String content[]={"好久不见","最近好吗","常联系"};
        File file=new File("world.txt");
        try {
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            for(int k=0;k<content.length;k++){
                bw.write(content[k]);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            String s=null;
            int i=0;
            //如果存在的文本行数不为null则进入循环
            while ((s=br.readLine())!=null){
                i++;
                System.out.println("第"+i+"行: "+s);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
