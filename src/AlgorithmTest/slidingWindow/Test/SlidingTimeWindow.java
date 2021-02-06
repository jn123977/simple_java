package AlgorithmTest.slidingWindow.Test;

import java.util.concurrent.TimeUnit;

/**
 * 滑动窗口
 *
 * @author jiangnan
 * @create 2021/2/5
 */
public class SlidingTimeWindow {
    /**
     * 单位时间多少块
     * 单位时间分割的数据
     */
    private int slot;
    /**
     * 单位时间的次数
     * 单位时间限制的数量
     */
    private long limit;
    /**
     * 单位时间
     */
    private TimeUnit timeUnit;
    /**
     * 记录窗口滑动到的Node(记录上次出窗口的移动位置)
     */
    private Node lastNode;
    /**
     * 每个slot的时间段
     */
    private long slotTime;

    public synchronized boolean checkAndAdd() {
        reset();
        long sum = getSum();
        System.out.println(sum);
        if (sum >= limit) {
            return false;

        }
        lastNode.addCounter();
        return true;
    }

    /**
     * 滑动窗口
     *
     * @param num
     * @param currentTimeMillis
     */
    public void reset(int num, long currentTimeMillis) {
        if (num <= 0) {
            return;
        }
        Node currentNode = lastNode;
        for (int i = 0; i < num; i++) {
            currentNode = currentNode.next;
        }
        currentNode.setTime(currentTimeMillis);
        currentNode.setCounter(0L);
        lastNode = currentNode;
    }

    /**
     * 滑动窗口
     */
    private void reset() {
        long currentTimeMillis = System.currentTimeMillis();
        long time = lastNode.getTime();
        int count = (int) ((currentTimeMillis - time) / slotTime);
        if (count > slot) {
            count = slot;
        }
        reset(count,currentTimeMillis);
    }

    /**
     * 获取当前创口有总数
     *
     * @return
     */
    private long getSum() {
        long sum = 0L;
        Node currentNode = lastNode;
        for (int i = 0; i < slot; i++) {
            sum += currentNode.counter;
            currentNode = currentNode.next;
        }
        return sum;
    }

    SlidingTimeWindow(int slot, long limit, TimeUnit timeUnit) {
        this.slot = slot;
        this.limit = limit;
        this.timeUnit = timeUnit;
        init();
    }

    private void init() {
        Node currentNode = null;
        long current = System.currentTimeMillis();
        for (int i = 0; i < slot; i++) {
            if (lastNode == null) {
                lastNode = new Node(current, 0, i + 1);
                currentNode = lastNode;
            } else {
                lastNode.next = new Node(current, 0, i + 1);
                lastNode = lastNode.next;
            }
        }
        lastNode.next = currentNode;
        //slotTime=timeUnit.getValue()/slot;
    }

}
