package learn.Network;

public class ThreadTester {
    public static void main(String[] args) {
        MyRunnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("back in main");
    }
}
