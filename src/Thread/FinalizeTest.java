package Thread;

public class FinalizeTest {
    public static void main(String[] args) {
        /**  JVM的启动的时候是多线程的吗？
         * 1.JVM启动至少启动了垃圾回收线程和主线程，所以是多线程
         * 2.main方法的代码执行的位置就是在主线程（路径）
         * 3.finalize()这个方法在子线程(垃圾回收线程)执行
         *
         * 多线程打印的顺序不一样，多线程是抢占资源
         */

        System.out.println("AAAA");
        System.out.println("BBBB");
        System.out.println("CCCC");
        System.out.println("DDDD");

        //打印线程名称
        System.out.println(Thread.currentThread());

        for(int i=0;i<2;i++){
            new Student();
            System.gc();  //启动垃圾回收
        }
    }
}

class Student{
    //被垃圾回收器回收时，会调用
    //对象从内存释放时，会调用
    @Override
    protected void finalize() throws Throwable {
        System.out.println("student 被回收了");
        System.out.println(Thread.currentThread());
    }
}