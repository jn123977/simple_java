package Thread;

public class NameTest {
    public static void main(String[] args) {
        //获取线程的名字和设置名字
        //getName() 和　setName()
        //可以通过构造函数传入String类型和名字

        //获取主线对象
        Thread mainThread=Thread.currentThread();
        System.out.println(mainThread);
        System.out.println("名称: "+mainThread.getName());

        mainThread.setName("主线程");
        System.out.println(mainThread);

        MyThread2 myThread=new MyThread2("子线程１");
        myThread.start();
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        System.out.println("任务！...."+Thread.currentThread());
    }

    public MyThread2(String name) {
        super(name);
    }
}