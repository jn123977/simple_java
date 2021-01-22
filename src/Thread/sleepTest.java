package Thread;

public class sleepTest {
    public static void main(String[] args) {
        //线程的休眠
        //xxx();
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread()+" "+i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        System.out.println("AAAAAAAAA");
    }

    private static void xxx() throws InterruptedException {
        for(int i=0;i<10;i++){  //主线程休眠
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("AAAAAAAAA");
    }
}
