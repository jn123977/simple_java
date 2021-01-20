package async;

import annotation.junit.Calculator;

public class CallBackTest1 {
    public static void main(String[] args) throws InterruptedException {
        int a =12;
        int b =20;
        Calculator2 calculator=new Calculator2(a,b);
        calculator.calculation();

        System.out.println("/==========================================/");
        for(int i=0;i<10;i++){
            Thread.sleep(1000);
            System.out.println(System.currentTimeMillis());
        }
    }
}

//回调接口
interface CallBackInterface2{
    //计算的结果回调函数
    public void calculationResult(int a,int b,int result);
}

//计算的具体逻辑类
class Logic1{
    //计算的具体逻辑（计算方式）
    public void calculationLogic(int a,int b,CallBackInterface2 callBackInterface){
        int result =a +b;
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //利用传进来的对象，回调计算结果
        callBackInterface.calculationResult(a,b,result);
    }
}

class Calculator2 implements CallBackInterface2{

    private int a,b;

    public Calculator2(int a,int  b){
        this.a=a;
        this.b=b;
    }

    public void calculation(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                /*匿名实例化计算的具体逻辑类Logic,并调用计算函数.
                this是本类对象,因为实现了回调接口CallBackInterface,所以可以传值.*/
                new Logic1().calculationLogic(a,b,Calculator2.this);
            }
        }).start();
    }

    //开启另一个子线程
    @Override
    public void calculationResult(int a, int b, int result) {
        System.out.println(a + " + " + b + " = " + result);
    }


}
