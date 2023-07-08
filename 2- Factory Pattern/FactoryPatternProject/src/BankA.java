public class BankA implements Bank {

    @Override
    public void withDraw() {
        System.out.println("BankA is handling your withdraw");
    }
}
