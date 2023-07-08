import MultiThreadSingletonSafety.SafeSingleton;
import javafx.concurrent.Task;

public class Main {
    public static void main(String[] args) {
        //counterImpl();
        //lazyCounterImpl();
        ThreadSafetySingleton();
    }
    public static void counterImpl(){
        Counter counter1 = Counter.getInstance();
        counter1.addOne();
        Counter counter2 = Counter.getInstance();
        counter2.addOne();

        System.out.println("counter 1  : "+counter1.count);
        counter1.addOne();
        System.out.println("counter 2  : "+counter2.count);
    }

    public static void lazyCounterImpl(){
        LazyCounter counter1 = LazyCounter.getInstance();
        counter1.addOne();
        LazyCounter counter2 = LazyCounter.getInstance();
        counter2.addOne();

        System.out.println("counter 1  : "+counter1.count);
        counter1.addOne();
        System.out.println("counter 2  : "+counter2.count);
    }

    public static void ThreadSafetySingleton(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SafeSingleton counter1 = SafeSingleton.getInstance();
                counter1.addOne();
                System.out.println("counter 1  : "+counter1.count);
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SafeSingleton counter2 = SafeSingleton.getInstance();
                counter2.addOne();
                System.out.println("counter 2 : "+counter2.count);
            }
        });
        thread2.start();

    }

}