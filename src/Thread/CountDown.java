package Thread;

public class CountDown {
    public static void main(String[] args) {
        int second=60;
        //倒计时６０秒
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=second;i>=0;i--){
                    System.out.println("剩余：　"+i);
                    //局部内部类可以访问局部变量，但是这个局部变量声明必须为Final
                    //局部内部类不能修改局部变量的
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("ｂｏｏｍ!");
            }
        }).start();
    }
}
