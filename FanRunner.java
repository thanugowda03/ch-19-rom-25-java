class FanRunner{
public static void main(String[] args){
System.out.println("main started");
Fan.onOrOff();

Fan.increaseSpeed();
Fan.increaseSpeed();
Fan.increaseSpeed();
Fan.increaseSpeed();
Fan.increaseSpeed();

Fan.decreaseSpeed();
Fan.decreaseSpeed();
Fan.decreaseSpeed();
Fan.decreaseSpeed();
Fan.decreaseSpeed();


System.out.println("main ended");

} 
}