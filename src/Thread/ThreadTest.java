package Thread;

public class ThreadTest {
    public static void main(String[] args) {
        /**
         *   线程实现的方式(1) --继承 Thread
         *  1.定义类继承Thread
         *  2.重写run方法
         *  3.把新线程要做的事写在run方法中
         *  4.创建线程对象
         *  5.开启新线程，内部会自动执行run方法
         */

        //使用子线程
        MyThread t1=new MyThread();

        //* 不能通过下面的方式执行任务
        // 因为这种方式的任务是在主线程完成的
        //t1.run();
        t1.start();   //start()内部会开启新线程，会调用run()方法
        System.out.println("======="+t1.getName());  //线程名称

        MyThread t2=new MyThread();
        t2.start();

        for(int i=0;i<10;i++){
            MyThread th=new MyThread();
            th.start();   //多线程的打印顺序是不一样的. 多线程是抢占资源
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("银行信用卡还款短行任务。。"+Thread.currentThread());
        System.out.println("线程名称: "+this.getName());
    }
}
