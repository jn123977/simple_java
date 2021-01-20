package oop.example;

import java.util.Arrays;

public class Test1 {


    /**
     * @param args
     * @see Animal  可能。。。。
     */
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Dog a3 = new Dog();


        a1.eat();

        a1.sleep();

//        String s = a1.sleep1();
        System.out.println(a2.hand);
        a2.eat();
        int a = 9;
        int b = 1;
        int c = a + b;

        System.out.println(c);

        System.out.println("bbb");
        String[] array = {"a", "b", "c", "d"};


//        for (int i=0;i<array.length;i++)

        for (String s1 : array) {
            System.out.println(s1);
        }


        String str = "sdfasdfasdfasd";
        String str1 = new String("asdfasdfasdfasd");

        String concat = str.concat(str1);


        StringBuffer buffer = new StringBuffer();

        StringBuilder stringBuilder = new StringBuilder();

        int[] strArray = {1, 2, 3, 4};

        String[] strArray1 = new String[]{};

//        "[1,2,3,4]"

//        strArray.length;
//        strArray.
//        strArray[2];

//        Arrays
        String[][] strings = {{}};


        str.notify();

        TestAbstract testAbstract = new TestAbstractImpl();

        testAbstract.testa();

        TestInterface testInterface = new TestInteraceImplB2();


    }

    public void String() {

    }
}
