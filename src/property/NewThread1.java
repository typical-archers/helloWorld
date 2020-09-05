package property;

public class NewThread1 extends Thread {
    public NewThread1(){
        super("Demo thread");
        System.out.println("Child thread: "+ this);
        start();
    }
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Child thread: "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
