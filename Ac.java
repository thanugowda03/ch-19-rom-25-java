class Ac {
static boolean isConnected;
static int currentTemperature;
static int maxTemperature = 4;
static int minTemperature=1;

public static void onOrOff(){
if(false==false){
isConnected = true;
System.out.println("Ac is turned on");
}
else if(isConnected==true)
{
isConnected=false;
System.out.println("Ac is turned off");
}
}
//increase Temperature
public static void increaseTemperature() {
System.out.println("Increse temperature started");
if(isConnected==true) {
	if(currentTemperature <= maxTemperature){
	currentTemperature=currentTemperature + 1;
	
System.out.println("The current temperature is " +currentTemperature);
	}else{
	System.out.println("Max temperature reached");
}	

}else{
	System.out.println("Turn on the Ac");
}
System.out.println("increase Ac is ended");	
	}


//decrease Temperature
public static void decreaseTemperature() {
	System.out.println("Decrease Temperature started");
if(isConnected==true) {
	if(currentTemperature >= minTemperature){
	currentTemperature=currentTemperature - 1;
System.out.println("The current temperature is" +currentTemperature);
	}
	else {
	System.out.println("Min Temperature reached");
}
}else{
	System.out.println("Turn on the Ac");
	
}
System.out.println("decrease temperature is ended");	

}	
}	




