package sync;

public class simpleDemo {
    public static void main(String[] args) {
        /**     同步代码块和同步方法
         * 　>什么情况下需要同步
         *  1.当多线程并发，有多段代码同时执行时，我们希望某一段代码执行的过程中cpu不要切
         * 换到其他线程工作,这就需要同步
         *  2.如果两段代码是同步的，那么同一时间只能执行一段，在一段代码没执行结束之前，不
         * 会执行另一段代码
         *
         *  >同步代码块
         *  1.使用synchronized关键字加上一个锁对象来定义一段代码，这就叫同步代码块
         *  2.多个同步代码块如果使用相同的锁对象，那么他么就是同步的
         *
         *  >同步方法
         *  1.使用synchronized关键字修饰一个方法，该方法中所有的代码都是同步的
         *  2.非静态同步函数的锁是：this
         *  3.静态同步函数的锁是：字节码对象(xx.class)
         *
         */

        //火车站卖票

        //创建卖票任务
        TicketTask task=new TicketTask();

        //A窗口
        Thread t1=new Thread(task);
        t1.setName("A窗口");
        //B窗口
        Thread t2=new Thread(task);
        t2.setName("B窗口");
        //C窗口
        Thread t3=new Thread(task);
        t3.setName("C窗口");
        //D窗口
        Thread t4=new Thread(task);
        t4.setName("D窗口");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class TicketTask implements Runnable{

    //只有１００张票　
    int ticket=100;

//    @Override
//    public void run() {
//        /**
//         *  同步代码块括号里可以传任何参数
//         */
//        synchronized (this){
//            //卖票
//            while (true){
//                if(ticket<=0){
//                    System.out.println("票卖光了!");
//                    break;
//                }else {
//                    System.out.println(Thread.currentThread().getName()+ ":  恭喜买到票了!  :"+ticket);
//                    ticket--;
//                }
//            }
//        }
//    }

    @Override
    public void run() {
        /**
         *  同步代码块括号里可以传任何参数
         */
        //卖票
        while (true) {
            synchronized (this) {
                if (ticket <= 0) {
                    System.out.println("票卖光了!");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + ":  恭喜买到票了!  :" + ticket);
                    ticket--;
                }
            }
        }
    }
}
