package HomeWork.day1_19;

import java.util.Date;

/**
 * 对比一下，一个对象中多个属性通过Setter方法赋值和通过构造器赋值的速度，并阐述原因。
 */
public class test1 {
    public static void main(String[] args) {
        while (true){
            t1();
            t2();
        }
    }

    public static void t1(){
        Person p=new Person("1","1","1","1","1");
    }

    public static void t2(){
        Person p=new Person();
        p.setAge1("1");
        p.setAge2("1");
        p.setAge3("1");
        p.setAge4("1");
        p.setAge5("1");
    }
}
class Person{
    private String age1;
    private String age2;
    private String age3;
    private String age4;
    private String age5;

    public Person(String age1, String age2, String age3, String age4, String age5) {
        this.age1 = age1;
        this.age2 = age2;
        this.age3 = age3;
        this.age4 = age4;
        this.age5 = age5;
    }

    public Person(){};

    public String getAge1() {
        return age1;
    }

    public void setAge1(String age1) {
        this.age1 = age1;
    }

    public String getAge2() {
        return age2;
    }

    public void setAge2(String age2) {
        this.age2 = age2;
    }

    public String getAge3() {
        return age3;
    }

    public void setAge3(String age3) {
        this.age3 = age3;
    }

    public String getAge4() {
        return age4;
    }

    public void setAge4(String age4) {
        this.age4 = age4;
    }

    public String getAge5() {
        return age5;
    }

    public void setAge5(String age5) {
        this.age5 = age5;
    }
}

