package charactor;

public class Suppot extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("进行治疗");
    }
}
