package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SimpleList {

    public static void main(String[] args) {
        //数组实现
        List arrayList = new ArrayList();
        //链表实现
        List linkedList = new LinkedList();
//
//        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add( 1);
        }
//
        System.out.println(arrayList);
//        long end = System.currentTimeMillis();
//        System.out.println("array:" + (end - start));
//
//
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            linkedList.add( i);
//        }
//        System.out.println(linkedList);
//        long end1 = System.currentTimeMillis();
//        System.out.println("link:" + (end1 - start1));
//
//        long start3 = System.currentTimeMillis();
////        for(int i=0;i<arrayList.size();i++){
////
////        }
////        Iterator iterator = arrayList.iterator();
////        while (iterator.hasNext()){
////            iterator.next();
////        }
//        for (Object o : arrayList) {
//
//        }
//        long end3 = System.currentTimeMillis();
//        System.out.println("array_read:" + (end3 - start3));
//
//        long start4 = System.currentTimeMillis();
//        int i = linkedList.indexOf(7777);
//        System.out.println(i);
//        for (Object o : linkedList) {
//
//        }
//        long end4 = System.currentTimeMillis();
//        System.out.println("link_read:" + (end4 - start4));


//        delList();
    }

    private static void delList() {
        //bad example
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        for (Object o : list) {
            list.remove(o);
        }


        //正确姿势（其实也不是完全正确）
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//            iterator.remove();
//        }
//        System.out.println(list);

    }
}
