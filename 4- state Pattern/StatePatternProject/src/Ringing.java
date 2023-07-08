public class Ringing implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Mobile is ringing");
    }
    @Override
    public String toString() {
        return "ringing class";
    }
}
