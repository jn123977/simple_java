package HomeWork.day1_19;

import java.io.*;

/**
 * 将99乘法表输出到一个文件中，要求按行输出，每一行代表不同的乘数，多线程实现。
 */
public class test3 {
    public static void main(String[] args) {
        File file=new File("aaa.txt");
        try {
            FileWriter fw=new FileWriter(file);
            BufferedWriter bw=new BufferedWriter(fw);
            for(Integer i=1;i<10;i++){
                String str="";
                for(Integer j=1;j<=i;j++) {
                    Integer sum=i*j;
                    str+=i.toString()+"*"+j.toString()+"="+sum.toString()+" ";
                }
                bw.write(str);
                System.out.println(str);
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
