package Thread;

public class joinDemo {
    public static void main(String[] args) {
        /** 加入线程
         * join(),当线程暂停，等待指定的线程执行结束后，当前线程再继续
         * join(int) ,可以等待指定的毫秒之后继续
         */
        Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i=0;i<100;i++){
                    System.out.println("线程A　"+i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

//        Thread t3=new Thread(){
//            @Override
//            public void run() {
//                for (int i=0;i<100;i++){
//                    System.out.println("线程c　"+i);
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("线程B　"+i);
                    if(i>10){
                        //加入
                        try {
                            //t1.join(); //t2暂停，直接到t1执行完后，t2才可以执行
                            t1.join(50); //t2暂停５０毫秒，让t1先执行５０毫秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        t1.start();
        t2.start();
//        t3.start();
    }
}
