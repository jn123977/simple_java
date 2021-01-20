package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SimpleSet {

    public static void main(String[] args) {
        //去重，无序
        Set hashSet = new HashSet();
        //去重，有序
        Set treeSet = new TreeSet();
//        hashSet.add("t");
//        hashSet.add("i");
//        hashSet.add("o");
//        boolean q = hashSet.add("q");
//        q = hashSet.add("q");
//        q = hashSet.add("q");
//        q = hashSet.add("q");

//        System.out.println(hashSet);

        treeSet.add("t");
        treeSet.add("i");
        treeSet.add("o");
        treeSet.add("q");
        treeSet.add("q");
        treeSet.add("q");
        treeSet.add("q");
//
        System.out.println(treeSet);


//        Set<Student> studentTreeSet = new HashSet<>();

//        Student student1 = new Student("1a", 1);
//        Student student2 = new Student("2a", 2);
//        Student student3 = new Student("3a", 3);
//        Student student4 = new Student("4a", 4);
//        Student student5 = new Student("5a", 5);
//        Student student6 = new Student("6a", 6);
//        Student student7 = new Student("7a", 6);
//        studentTreeSet.add(student3);
//        studentTreeSet.add(student1);
//        studentTreeSet.add(student2);
//        studentTreeSet.add(student5);
//        studentTreeSet.add(student4);
//        studentTreeSet.add(student6);
//        studentTreeSet.add(student7);
//        Comparator<Person> reversed = Comparator.comparingInt(Person::getAge).reversed()
//                .thenComparing(Person::getId).reversed();
//        studentTreeSet = studentTreeSet.stream()
//                .sorted(reversed)
//                .collect(Collectors.toCollection(LinkedHashSet::new));
//        List<Student> list = new ArrayList<>();
//        list = list.stream().sorted().collect(Collectors.toList());
//
//        List<Student> returnList = new ArrayList<>();
//        for (Student student : list) {
//            ///.......
//            returnList.add(student);
//        }
//        System.out.println(studentTreeSet);

    }
}
