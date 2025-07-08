class WashingMachine {
static boolean isConnected;
static int currentSpeed;
static int maxSpeed = 4;
static int minSpeed=1;

public static void onOrOff(){
if(false==false){
isConnected = true;
System.out.println("Washing Machine is turned on");
}
else if(isConnected==true)
{
isConnected=false;
System.out.println("Washing Machine is turned off");
}
}
//increase speed
public static void increaseSpeed() {
System.out.println("Increse speed started");
if(isConnected==true) {
	if(currentSpeed <= maxSpeed){
	currentSpeed=currentSpeed + 1;
	
System.out.println("The current speed is" +currentSpeed);
	}else{
	System.out.println("Max Speed reached");
}	

}else{
	System.out.println("Turn on the Washing Machine");
}
System.out.println("increase Speed is ended");	
	}


//decrease speed
public static void decreaseSpeed() {
	System.out.println("Decrease speed started");
if(isConnected==true) {
	if(currentSpeed >= minSpeed){
	currentSpeed=currentSpeed - 1;
System.out.println("The current speed is" +currentSpeed);
	}
	else {
	System.out.println("Min speed reached");
}
}else{
	System.out.println("Turn on the Washing Machine");
	
}
System.out.println("decrease speed is ended");	

}	
}	




