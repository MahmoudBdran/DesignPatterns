public class Silent implements MobileAlertState{
    @Override
    public void alert() {
        System.out.println("Mobile is in silent mode");
    }

    @Override
    public String toString() {
        return "Silent class";
    }
}
