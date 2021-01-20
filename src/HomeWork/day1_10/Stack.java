package HomeWork.day1_10;

public class Stack {
    public static void main(String[] args) {
        //栈内存溢出 StackOverflowError
        new Stack().test();
    }
    public void test(){
        test();
    }
}
