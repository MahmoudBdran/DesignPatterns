package FactoryPackage;

public class BankB implements IBank{
    @Override
    public void withDraw() {
        System.out.println("Bank B withdraw");
    }
}
