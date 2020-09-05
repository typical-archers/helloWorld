package property;

public class NewThread implements Runnable {
    public Thread t;
    String name ;

    public NewThread(String threadName){
        //creat a new second thread
        name = threadName;
        t = new Thread(this,name);
        System.out.println("New thread: " +t);
        t.start();// start the thread
    }
    // this is the entry point for the second thread
    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(name +" : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
