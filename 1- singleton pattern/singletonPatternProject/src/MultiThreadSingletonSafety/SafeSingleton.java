package MultiThreadSingletonSafety;

import java.util.Date;


public class SafeSingleton {
    public int count=0;
    private static SafeSingleton instance =null;

    private static Object lockObj =  new Object();
    private SafeSingleton(){}
    public static SafeSingleton getInstance(){
        if(instance==null){
            synchronized (lockObj){
                instance= new SafeSingleton();
            }
        }
        return instance;
    }
    public void addOne(){
        count++;
    }
}
