package Thread;

public class PriorityDemo {
    public static void main(String[] args) {
        //yield()让出cpu
        /**  线程的优先级
         * 1.setPriority()  设置线程的优先级
         * 2.线程的优先级是从1－10
         * 3.每个线程都有默认优先级5
         * 4.优先级大的线程，一般任务先执行完
         */
        //xxx();

        Thread t1=new Thread(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("线程A "+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2=new Thread(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("线程B "+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }

    private static void xxx() {
        Thread t1=new Thread(){
            @Override
            public void run() {
                //打印线程对象
                /**     Thread[Thread-0,5,main]
                 *  Thread-0:线程名
                 *  5:优先级
                 *  main:线程组
                 */
                System.out.println(Thread.currentThread());
            }
        };
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
    }
}
