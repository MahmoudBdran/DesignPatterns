import FactoryPackage.BankFactory;
import FactoryPackage.BankFactoryImpl;
import FactoryPackage.IBank;
import SingletonPackage.Counter;
import SingletonPackage.LazyCounter;
import StatePackage.MobileContext;
import StatePackage.Silent;

public class Main {
    public static void main(String[] args) {
       //singletonImpl();
        //factoryImpl();
        stateImpl();


    }

    public static void singletonImpl(){
        Counter counter = Counter.getInstance();
        counter.add();

        LazyCounter counter2 = LazyCounter.getInstance();
        counter2.add();
    }
    public static void factoryImpl(){
        BankFactory bankFactory = new BankFactoryImpl();
        IBank bank = bankFactory.getBank(123456789);
        bank.withDraw();
    }

    public static void stateImpl(){
        MobileContext mobileContext = new MobileContext();
        mobileContext.alert();
        mobileContext.setState(new Silent());
        mobileContext.alert();
    }
}