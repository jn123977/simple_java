package oop.example;

import oop.Person;
//import other.A;
import sun.misc.Launcher;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;

public class StaticTest extends Person {

    static StaticTest staticTest = new StaticTest();


    static {
        System.out.println(1);
    }
    //实例代码块

    {
        System.out.println(2);
    }

    //实例构造 方法
    StaticTest() {
        System.out.println(3);
    }


    public static void staticFun() {
        System.out.println(4);
    }

    int a = 5;  //实例变量
    static int b = 6; //在准备阶段，这里的b值是0,b同时也在准备阶段被赋值成6
    static final int A = 1;


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException, IOException {
        staticFun();
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL urL : urLs) {
            System.out.println(urL.toExternalForm());
        }

//        StaticTest staticTest = new StaticTest();
//        //反射
//        Class<?> aClass = Class.forName("oop.StaticTest");
//        StaticTest staticTest1 = (StaticTest) aClass.newInstance();
//        Constructor<?>[] constructors = Person.class.getConstructors();
//        for (Constructor<?> constructor : constructors) {
//            System.out.println(constructor);
//        }
//        Constructor<Person> constructor = Person.class.getConstructor(Integer.class, Integer.class, String.class);
//        Person person = constructor.newInstance(1, 123, "aaa");
//
//        //通过clone的方式
//        Constructor<Person> constructor1 = Person.class.getConstructor(Integer.class, Integer.class, String.class);
//        Person person1 = constructor.newInstance(2, 123, "aaa");
//        //Person clone = (Person) person1.clone();
//
//        //序列化与反序列化
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.abc"));
//        //objectOutputStream.writeObject(clone);
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.abc"));
//        Person object = (Person) objectInputStream.readObject();
//
//        String aaa = "";
//
//        String aaa1 = new String("");

//        ClassLoader.getSystemClassLoader().getResource()
    }
}
