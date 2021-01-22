package Thread;

public class RunnableTest {
    public static void main(String[] args) {
        /**  线程实现的方式-------定义类实现Runnable接口
         *  1.实现run方法
         *  2.把新线程要做的事写在run方法中
         *  3.创建自定义的Runnable的子类对象创建Thread对象，传入Runnable
         *  4.调用start()开启新线程，内部会自动调用Runnable的run()方法
         *
         */

        BankTask task=new BankTask();
        Thread t1=new Thread(task);
        t1.start();

        for(int i=0;i<10;i++){
            Thread thread=new Thread(task);
            thread.start();
        }
    }
}
class BankTask implements Runnable{

    @Override
    public void run() {
        System.out.println("银行储蓄卡自动结算利息任务。。。　"+Thread.currentThread());
        System.out.println("线程名称：　"+Thread.currentThread().getName());
    }
}
