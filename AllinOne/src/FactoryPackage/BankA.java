package FactoryPackage;

public class BankA implements IBank{
    @Override
    public void withDraw() {
        System.out.println("Bank A withdraw");
    }
}
