package SingletonPackage;

public class ThreadSafeSingleton {

    public int count =0;
    private static ThreadSafeSingleton instance;
    private static Object lockObj= new Object();
    private ThreadSafeSingleton(){}
    public static ThreadSafeSingleton getInstance(){
        if(instance==null){
           synchronized (lockObj){
                   instance=new ThreadSafeSingleton();
           }
        }
        return instance;
    }
    public int add(){
        return ++count;
    }
}
