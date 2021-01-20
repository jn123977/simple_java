package oop;//package oop;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.*;
//import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.concurrent.CountDownLatch;
//import java.util.stream.Collectors;
//
//public class TestMain {
//
//
//    public static void main(String[] args) throws InterruptedException {
////        Person person = new Person();
////
////
////        Student student = new Student();
////
////
////        Teacher teacher = new Teacher();
//
////        String personId = person.getId();
////
////
////        System.out.println(student.getId());
////        System.out.println(personId);
////        person.setId(personId);
//
//
//        Person person = new Student();
//
//
//        System.out.println(person.getId());
//
//        person.print();
//
//
//        Student student = null;
////
////        CountDownLatch countDownLatch = new CountDownLatch(20);
////
////
////        countDownLatch.countDown();
//
//
////        try {
////            countDownLatch.await();
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
//
////        countDownLatch.await();
//
////        InputStream stream;
////        try {
////            stream = new FileInputStream("");
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        }
//
////
////        try () {
////            System.out.println(student.getClazzId());
////        } catch (IllegalAccessException e|NullPointerException e){
////            System.out.println("这空指针了！");
////            e.printStackTrace();
////        }finally{
////            stream.close();
////        }
//
//
////        Student student1=new Student();
////
////        if(student.equals(student1)){
////
////
////        }
//
//        String[] a = {};
//
//
//        List list = new ArrayList();
//
//        List list1 = new LinkedList();
//
//        List list2 = new CopyOnWriteArrayList();
//
////        list.get(5);
//
//        Set set = new TreeSet();
//
//        Map<String, String> map = new HashMap();
////
////        Map map1 = new TreeMap();
//
//
////        for (Object o : list) {
////
////        }
//
////        Iterator iterator = list.iterator();
////        while (iterator.hasNext()){
////
////        }
//
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("a");
//        list.add("e");
//        list.add("f");
//
//        List alist = new ArrayList();
//
//        for (Object o : list) {
//            if ("a".equals((String) o)) {
//                alist.add(o);
//            }
//        }
//        System.out.println(alist);
//
//
//        Object collect = list
//                .stream()
//                .filter("a"::equals)
//                .collect(Collectors.toList());
//        System.out.println(collect);
//
//        list.forEach(e -> {
//            System.out.println(e);
//        });
//
//
//        map.put("a", "b");
//        map.put("c", "d");
//        map.put("e", "f");
//
//        map.forEach((k, v) -> System.out.println(k + "_" + v));
//
//        System.out.println(list);
//
//        Collections.reverse(list);
//
//        System.out.println(list);
//
//        Collections.shuffle(list);
//
//        System.out.println(list);
//
//        List synchronizedList = Collections.synchronizedList(list);
//
//
//    }
//
//
////    public String generateId(String studentName, String id) {
////        if (studentName == null || id == null) {
////            return "";
////        }
////        return id + "_" + studentName;
////    }
//
//
//}
