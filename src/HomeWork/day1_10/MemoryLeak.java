package HomeWork.day1_10;

import java.util.Vector;

public class MemoryLeak {

    /**
     * 内存溢出
     * 但是一般不会对程序有什么影响，严重的会导致程序卡死，OutOfMemoryError
     * @param args
     */
    public static void main(String[] args) {
        Vector v=new Vector(10);
        for(int i=0;i<10000000;i++){
            Object o=new Object();
            v.add(o);
            o=null;
        }
    }
}
