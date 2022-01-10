package learn.Network;

public class RyanAndMonicaJob implements Runnable{

    private BankAccount account=new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob job = new RyanAndMonicaJob();
        Thread one = new Thread(job);
        Thread two=new Thread(job);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            getName();
            makeWithdraw(10);
            if (account.getBalance()<0){
                System.out.println("Overdrawn!");
            }
        }
    }
    private synchronized void makeWithdraw(int amount){
        if (account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName()+" is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" completed the withdraw");
        }else {
            System.out.println("sorry, not enough for "+Thread.currentThread().getName());
        }
    }

    private void getName(){
        System.out.println(Thread.currentThread().getName());
    }
}
