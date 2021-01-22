package Thread;

public class insideTest {
    public static void main(String[] args) {
        //匿名内部类实现线程的方式
        Thread t1=new Thread(){
            @Override
            public void run() {
                System.out.println("任务1...."+Thread.currentThread());
            }
        };
        t1.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("任务1...."+Thread.currentThread());
            }
        }.start();


        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("任务2...."+Thread.currentThread());
            }
        });
        t2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("任务2...."+Thread.currentThread());
            }
        }).start();
    }
}
