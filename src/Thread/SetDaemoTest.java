package Thread;

public class SetDaemoTest {
    public static void main(String[] args) {
        /**     守护线程
         *  setDaemo().设置一个线程为守护线程，该线程不会单独执行，
         * 当其他非守护线程都执行结束后，自动退出
         */

        Thread t1=new Thread(){
            @Override
            public void run() {
                for(int i=0;i<5;i++){
                    System.out.println("线程－女　"+i);
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                for(int i=0;i<15;i++){
                    System.out.println("线程－男　"+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
