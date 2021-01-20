package HomeWork.day1_10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Leet5 {
    /**
     * 5、给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值 的那两个整数，并返回它们的数组下标。
     * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
     * 你可以按任意顺序返回答案。
     *
     * demo:
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
     */
    public static void main(String[] args) {
//        boolean flag=false;
        int target=18;


        Integer[] nums={2,7,11,15};
        List<Integer> list= Arrays.asList(nums);
        for(int i=0;i<list.size();i++){
            int number=list.get(i);
            for(int x=i+1;x<list.size();x++){
                if(target==number+list.get(x)){
                    System.out.println("["+i+","+x+"]");
//                    flag=true;
                    return;
                }
            }

        }
    }
}
