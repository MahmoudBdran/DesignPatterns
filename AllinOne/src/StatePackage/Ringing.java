package StatePackage;

public class Ringing implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Ringing");
    }
}
