package HomeWork.day1_10;

import java.util.*;

public class Leet4 {
    /**
     * 4、在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
     *    数组中某些数字是重复的，但不知道有几个数字重复了，
     *     也不知道每个数字重复了几次。请找出数组中任意一个重复的数字
     *
     * 输入：
     * [2, 3, 1, 0, 2, 5, 3]
     * 输出：2 或 3
     */
    public static void main(String[] args) {

        HashMap<Integer,Integer> hashMap=new HashMap<>();

        int number=0;

        Integer[] ints={2,3,1,0,2,5,3};
        List<Integer> list=Arrays.asList(ints);

        for(int i=0;i<list.size();i++){
            number=1;
            int flag=list.get(i);
            for(int x=i+1;x<list.size();x++){
                if(flag==list.get(x)){
                    number++;
                }
            }
            if(number!=1){
                hashMap.put(flag,number);
            }
        }

        Set<Map.Entry<Integer,Integer>> set=hashMap.entrySet();
        for(Map.Entry<Integer,Integer> a:set){
            System.out.println("数字:"+a.getKey()+"----"+"次数"+a.getValue());
        }

    }
}
