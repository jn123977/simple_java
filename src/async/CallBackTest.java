package async;

public class CallBackTest {
    public static void main(String[] args) {
        int a =10452;
        int b =423;
        Calculator calculator=new Calculator(a,b);
        calculator.calculation();
        System.out.println("/===============================/");
    }
}

//回调接口
interface  CallBackInterface{
    void calculationResult(int a,int b,int result);

    public void calculation();
}

class Logic{
    public void calculationLogic(int a,int b,CallBackInterface callBackInterface){
        int result=a+b;
        callBackInterface.calculation();
    }
}

class Calculator implements CallBackInterface{
    private int a,b;

    public Calculator(int a,int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void calculationResult(int a, int b, int result) {
        System.out.println(a+"+"+b+"="+result);
    }

    @Override
    public void calculation() {
        new Logic().calculationLogic(a,b,this);
    }
}