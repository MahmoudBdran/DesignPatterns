public class LazyCounter {
    public int count=0;
    //this is for the common initialization step..
    private static LazyCounter instance =null;

    // this is the lazy initialization .. cause the default (above) make this instance anyway .. but lazy
    // makes it when we use it .. that is good for memory utilization.

    private LazyCounter(){}
    public static LazyCounter getInstance(){
        if(instance==null){instance= new LazyCounter();}
        return instance;
    }
    public void addOne(){
        count++;
    }
}
