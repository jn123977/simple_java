package AlgorithmTest.slidingWindow;

import java.util.LinkedList;

/**
 * @author jiangnan
 * @create 2021/2/5
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 */
public class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int right = 0;
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        LinkedList<Integer> list = new LinkedList<>();  // 开始构造窗口
        while (right < nums.length) {   // 这里的list的首位必须是窗口中最大的那位

            while (!list.isEmpty() && nums[right] > list.peekLast()) {
                list.removeLast();
            }

            // 不断添加
            list.addLast(nums[right]);
            right++;    // 构造窗口完成，这时候需要根据条件做一些操作
            if (right >= k) {
                res[index++] = list.peekFirst();    // 如果发现第一个已经在窗口外面了，就移除
                if (list.peekFirst() == nums[right - k]) {
                    list.removeFirst();
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] list={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] a= maxSlidingWindow(list,k);
        System.out.println(a);
    }
}
