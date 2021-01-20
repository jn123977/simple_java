package annotation;

public class Person {
    /**
     * empty()方法同时被"@Deprecated"和"@MyAnnotation(value={"a","b"})"所标注
     * (01)@Deprecated，意味着empty()方法,不再被建议使用
     * (02)TestAnnotation,意味着empty()　方法对应的MyAnnotation的value值是默认值“unknown”
     */

    @TestAnnotation
    @Deprecated
    public void empty(){   //empty空的
        System.out.println("\nempty");
    }

    /**
     * somebody() 被@MyAnnotation(value={"girl","boy"})所标注
     * @TestAnnotation(value={"girl","boy"}),意味着MyAnnnotation的value值是{"girl","boy"}
     */
    @TestAnnotation(value = {"girl","boy"})   //有人
    public void somebody(String name,int age){
        System.out.println("\nsomebody: "+name+","+age);
    }

}
