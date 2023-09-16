package FactoryPackage;

public class BankFactoryImpl implements BankFactory{
    @Override
    public IBank getBank(int bankCode) {
       IBank bank = null;
        switch (bankCode){
            case 1234567:
                bank=new BankA();
                break;
            case 111111:
                bank= new BankB();
                break;
            default:
                System.out.println("there is no bank with this credit card!");

        }
        return bank;
    }
}
