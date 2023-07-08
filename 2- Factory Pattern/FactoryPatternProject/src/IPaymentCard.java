public interface IPaymentCard {
    String getName();
    String getProviderName();

}
class VisaCard implements IPaymentCard{
    @Override
    public String getName() {
        return "visa card";
    }

    @Override
    public String getProviderName() {
        return "visa";
    }
}

class MasterCard implements IPaymentCard{
    @Override
    public String getName() {
        return "Master card";
    }

    @Override
    public String getProviderName() {
        return "MasterCard";
    }
}
