package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Annotation：注解
 */
public class AnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person=new Person();
        //获取Person的Class实例
        Class<Person> p=Person.class;
        //获取somebody()方法的Method实例
        Method mSomebody=p.getMethod("somebody", String.class, int.class);
        //执行该方法
        mSomebody.invoke(person,"lily",18);
        iteratorAnnotations(mSomebody);

        System.out.println("/==============================================/");
        //获取somebody()方法的Method实例
        Method mEmpty=p.getMethod("empty",new Class[]{});
        //执行该方法
        mEmpty.invoke(person,new Object[]{});
        iteratorAnnotations(mEmpty);
    }

    public static void iteratorAnnotations(Method method){

        //判断方法是否包含MyAnnotation注解
        if(method.isAnnotationPresent(TestAnnotation.class)){
            //获取该方法的MyAnnotation注解实例
            TestAnnotation myAnnotation=method.getAnnotation(TestAnnotation.class);
            //获取myAnnotation的值，并打印出来
            String[] values=myAnnotation.value();
            for(String str:values){
                System.out.println(str+", ");
            }
            System.out.println();
        }

        //获取方法上的所有注解，并打印出来
        Annotation[] annotations=method.getAnnotations();
        for(Annotation annotation:annotations){
            System.out.println(annotation);
        }
    }
}
