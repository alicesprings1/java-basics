package learn.Network;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        go();
    }

    public void go(){
        doMore();
    }

    public void doMore(){
        System.out.println("top o' the stack");
    }
}
