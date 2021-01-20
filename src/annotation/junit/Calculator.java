package annotation.junit;

public class Calculator {
    @check
    public void add(){
        String str=null;
        str.toString();
        System.out.println("1+0= "+(1+0));
    }
    @check
    public void sub(){
        System.out.println("1-0= "+(1-0));
    }
    @check
    public void mul(){
        System.out.println("1*0= "+(1*0));
    }
    @check
    public void div(){
        System.out.println("1+/0= "+(1/0));
    }

    public void show(){
        System.out.println("永无bug");
    }
}
