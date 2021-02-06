package AlgorithmTest.slidingWindow.Test;

/**
 * @author jiangnan
 * @create 2021/2/5
 */
public class Node {
    private int id;
    private long time; //启始时间
    long counter; //计数器
    Node next;  //下一个窗口


    public Node(Node next) {
        this.next = next;
    }

    public Node() {
    }


    public Node(long time, long counter, int id) {
        this.time = time;
        this.counter = counter;
        this.id = id;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getCounter() {
        return counter;
    }

    public void addCounter() {
        this.counter = this.counter + 1;
    }

    public void setCounter(long counter) {
        this.counter = counter;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "time=" + time +
                ", counter=" + counter +
                ", next=" + next +
                ", id=" + id +
                '}';
    }
}
