package HomeWork.day1_19;

import java.util.LinkedList;
import java.util.List;

/**
 *写一个增强型for循环指定break例子，并解释其运行顺序（在代码中用注释写）。
 */
public class test2 {
    public static void main(String[] args) {

        int[] list={1,2,3,4,5,6,7,8,9,10};
        for(int i:list){
            System.out.println(i);
            if(i==5)    break;
        }
    }
}
