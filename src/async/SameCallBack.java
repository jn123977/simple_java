package async;

public class SameCallBack {
    public static void main(String[] args) {
        XiaoMing xiaoMing=new XiaoMing();
        XiaoFang xiaoFang=new XiaoFang(xiaoMing);
        xiaoFang.doSome();
    }
}

interface CallBackInterface1{
    public void execute();
}

class XiaoMing implements CallBackInterface1{

    public XiaoMing(){
        System.out.println("小芳再做啥？");
    }

    @Override
    public void execute() {
        System.out.println("收到了！");
    }
}

class XiaoFang{
    private CallBackInterface1 callBack;

    public XiaoFang(){}

    public XiaoFang(CallBackInterface1 callBack){
        this.callBack=callBack;
    }

    public void doSome(){
        System.out.println("去洗碗了");
        callBack.execute();
    }
}