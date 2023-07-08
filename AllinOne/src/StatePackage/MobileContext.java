package StatePackage;

public class MobileContext {
private MobileAlertState currentState;
public MobileContext(){
    this.currentState=new Ringing();
}
public void setState(MobileAlertState state){
    this.currentState =state;
}
public void alert(){
    currentState.alert();
}

}
