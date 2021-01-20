package async;

public class DifferentCallBack {
    public static void main(String[] args) {
        Server server=new Server();

        ClientA clientA=new ClientA(server);
        clientA.process(5,6);

        ClientB clientB=new ClientB(server);
        clientB.process(50,60);
    }

}
interface Client{

    //
    void process(int a,int b);
    void result(int i);
}

class ClientA implements Client{

    private Server server;

    public ClientA(Server server){
        this.server=server;
    }

    @Override
    public void process(int a, int b) {
        ClientA c=this;
        new Thread(new Runnable() {
            @Override
            public void run() {
                server.add(a,b,c);
            }
        }).start();
        System.out.println("ClientA process end!");
    }

    @Override
    public void result(int i) {
        System.out.println("ClientA result is :"+i);
    }
}

class ClientB implements Client{

    private Server server;

    public ClientB(Server server){
        this.server=server;
    }

    @Override
    public void process(int a, int b) {
        ClientB c=this;
        new Thread(new Runnable() {
            @Override
            public void run() {
                server.add(a,b,c);
            }
        }).start();
        System.out.println("ClientB process end!");
    }

    @Override
    public void result(int i) {
        System.out.println("ClientB result is :"+i);
    }
}

class Server{
    public void add(int i,int j,Client client){
        int res=i+j;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        client.result(res);
    }
}