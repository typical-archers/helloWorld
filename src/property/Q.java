package property;

public class Q {
    boolean valueSet = false;
    int n ;
    synchronized int get(){
        if (!valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Got " + n);
        valueSet = false;
        notify();
        return n;
    }
    synchronized void put(int n){
        if (valueSet){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.n = n;
        valueSet = true;

        System.out.println("Put " + n);
        notify();
    }
}
