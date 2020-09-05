package property;

public class Clicker implements Runnable {
    public int clicker = 0;
    public Thread t ;
    private volatile boolean running = true;

    public Clicker(int p){
        t = new Thread(this);
        t.setPriority(p);
    }

    @Override
    public void run() {
        while (running){
        clicker ++;
        }
    }
    public void stop(){
        running = false;
    }
    public void start(){
        t.start();
    }
}
