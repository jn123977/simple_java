package HomeWork.day1_19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.OutputStream;

public class test3 {
    public static void main(String[] args) {
        File file=new File("aaa.txt");
        OutputStream out=null;
        BufferedOutputStream bos=null;
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }
}
