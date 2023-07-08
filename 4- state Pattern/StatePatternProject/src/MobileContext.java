//public class MobileContext {
//    MobileAlertState currentState;
//    public MobileContext() {
//        currentState=new Ringing();
//    }
//
//    public  void setState(MobileAlertState state){
//        currentState =  state;
//    }
//    public void alert(){
//        currentState.alert();
//    }
//    public MobileAlertState getCurrentState(){
//        return currentState;
//    }
//}

public class MobileContext{
    MobileAlertState currentState;

    public MobileContext() {
        this.currentState = new Ringing();
    }
    public void setState(MobileAlertState state){
        currentState=state;
    }
    public void alert(){
        currentState.alert();
    }
    public MobileAlertState getCurrentState(){
        return currentState;
    }
}