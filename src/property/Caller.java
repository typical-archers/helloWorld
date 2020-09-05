package property;

public class Caller implements Runnable {
    public Thread t;
    public String msg;
    CallMe targrt;

    public Caller(CallMe targ, String s){
        msg = s;
        targrt = targ;
        t = new Thread(this);
        t.run();
    }

    @Override
    public void run() {
        synchronized (targrt){
            targrt.call(msg);
        }
//        targrt.call(msg);
    }

}
