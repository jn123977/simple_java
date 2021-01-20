package HomeWork.day1_10;

/**
 * 写一个包含老师、学生、家长三个角色。老师可以同步给学布置作业，
 *     同时家长可以异步收到老师布置的作业信
 */
public class task {
    public static void main(String[] args) {
        Student s1=new Student();
        Teacher t1=new Teacher(s1);
        t1.send();

        Student s2=new Student();
        Teacher t2=new Teacher(s2);
        t2.send();

        System.out.println("/==================================================/");

        Homework homework=new Homework();

        Teacher t3=new Teacher(homework);
        t3.process();

        Parent p1=new Parent(homework);
        p1.process();

        Parent p2=new Parent(homework);
        p2.process();

        Parent p3=new Parent(homework);
        p3.process();

    }
}

interface CallBackInterface{
    void process();
    void result();
}

class Student implements CallBackInterface{

    @Override
    public void process() {
    }

    @Override
    public void result() {
        System.out.println("student 收到作业!");
    }
}
class Teacher implements CallBackInterface{

    private Homework homework;

    private CallBackInterface callBack;

    public Teacher(CallBackInterface callBack){
        this.callBack=callBack;
    }
    public Teacher(Homework homework){
        this.homework=homework;
    }

    public void send(){
        System.out.println("Teacher 发作业!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callBack.result();
    }

    @Override
    public void process() {
        Teacher a=this;
        new Thread(new Runnable() {
            @Override
            public void run() {
                homework.xxx(a);
            }
        }).start();
        System.out.println("发送中！");
    }

    @Override
    public void result() {
        System.out.println("发送成功！");
    }
}
class Parent implements CallBackInterface{

    private Homework homework;

    public Parent(Homework homework){
        this.homework=homework;
    }

    @Override
    public void process() {
        Parent a=this;
        new Thread(new Runnable() {
            @Override
            public void run() {
                homework.xxx(a);
            }
        }).start();
        System.out.println("收到中！");
    }

    @Override
    public void result() {
        System.out.println("Parent 收到作业信!");
    }
}

class Homework{
    public void xxx(CallBackInterface callBackInterface){
        System.out.println("。。。。。。。。。");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        callBackInterface.result();
    }
}
