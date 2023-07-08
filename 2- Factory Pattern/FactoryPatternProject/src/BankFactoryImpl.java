public class BankFactoryImpl implements BankFactory{
    @Override
    public Bank getBank(int bankCode) {
        switch (bankCode){
            case 123456:return new BankA();
            case 111111:return new BankB();
        }
        return null;
    }

    @Override
    public IPaymentCard getPaymentCard(int cardNumber) {
        switch (cardNumber){
            case 123456:return new MasterCard();
            case 111111:return new VisaCard();
        }
        return null;
    }
}
