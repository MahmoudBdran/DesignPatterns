package SingletonPackage;

public class Counter {
    int count =0;
    private static  Counter instance= new Counter();
    private Counter(){}
    public static Counter getInstance(){
         return instance;
    }
    public int add(){
        return ++count;
    }
}
