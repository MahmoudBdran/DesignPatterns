package SingletonPackage;

public class LazyCounter {
    public int count =0;
    private static LazyCounter instance;
    private LazyCounter(){}
    public static LazyCounter getInstance(){
        if(instance==null){
            instance=new LazyCounter();
        }
        return instance;
    }
    public int add(){
        return ++count;
    }
}
