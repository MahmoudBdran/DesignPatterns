public class Counter {
    public int count=0;
    //this is for the common initialization step..
    private static Counter instance = new Counter();

    // this is the lazy initialization .. cause the default (above) make this instance anyway .. but lazy
    // makes it when we use it .. lazy initialization made in LazyCounter class

    private Counter(){}
    public static Counter getInstance(){
        return instance;
    }
    public void addOne(){
        count++;
    }
}
