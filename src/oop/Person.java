package oop;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Person {

    //属性
    private Integer id;
    private int age;
    private String password;
    private String email;
    private String username;

    //无参构造方法
    public Person() {

    }

    public Person(Integer id, int age, String username) {
        this.id = id;
        this.age = age;
        this.username = username;
    }


    //对每个属性创建对应的Getter Setter方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    private boolean isStudent;
//    public Person(String id, int age) {
//        this.id = id;
//        this.age = age;
//    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void print() {
        System.out.println(this.age + "_" + this.username);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException, IOException {
        Person person = new Person(); //实例
        Person person1 = new Person(1, 11, "aaa");
    }
}
