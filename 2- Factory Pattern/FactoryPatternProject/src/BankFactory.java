public interface BankFactory {

    public Bank getBank(int bankCode);

    public IPaymentCard getPaymentCard(int cardNumber);
}   
