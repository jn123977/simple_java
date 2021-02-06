package AlgorithmTest;

import AlgorithmTest.slidingWindow.SystemClock;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author jiangnan
 * @create 2021/2/6
 */
public class test {
    static Map<Integer,aaa1> map=new LinkedHashMap<>();
    public static void main(String[] args) {
//        for(int i=0;i<10;i++){
//            aaa(i,10-i);
//        }
//        aaa1 a1= map.get(2);
//        aaa1 a2=map.get(3);
//        System.out.println(a1);
//        System.out.println(a2);
        long time=System.currentTimeMillis();
        System.out.println(SystemClock.now());
        System.out.println(time);
    }

    public static void aaa(int key,int value){
        aaa1 a1=new aaa1(value);
        map.put(key,a1);
    }
}

class aaa1{
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public aaa1(int a) {
        this.a = a;
    }
}