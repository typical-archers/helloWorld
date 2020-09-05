package property;

public class CallMe {
    void call(String msg){
        System.out.println("[" +msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("]");
    }


}
