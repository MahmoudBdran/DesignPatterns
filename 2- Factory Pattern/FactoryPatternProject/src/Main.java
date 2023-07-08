import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    BankFactory bankFactory = new BankFactoryImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your credit card number : ");
        int cardNumber = scanner.nextInt();
        int bankCode = Integer.parseInt(String.valueOf(cardNumber).substring(0,6));
        Bank bank = bankFactory.getBank(bankCode);
        IPaymentCard paymentCard = bankFactory.getPaymentCard(123456);
        bank.withDraw();
        System.out.println(paymentCard.getName());

    }
}