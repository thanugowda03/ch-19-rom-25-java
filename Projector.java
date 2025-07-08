class Projector {
static boolean isConnected;
static int currentVolume;
static int maxVolume = 5;
static int minVolume=1;
//onOrOff
//increaseVolume
//decreaseVolume
public static void onOrOff(){
if(false==false){
isConnected = true;
System.out.println("Projector is turned on");
}
else if(isConnected==true)
{
isConnected=false;
System.out.println("Projector is turned off");
}
}
//increase volume
public static void increaseVolume() {
System.out.println("Increse volume started");
if(isConnected==true) {
	if(currentVolume <= maxVolume){
	currentVolume=currentVolume + 1;
	
System.out.println("The current volume is" +currentVolume);
	}else{
	System.out.println("Max volume reached");
}	

}else{
	System.out.println("Turn on the Projector");
}
System.out.println("increase volume is ended");	
	}


//decrease volume
public static void decreaseVolume() {
	System.out.println("Decrease volume started");
if(isConnected==true) {
	if(currentVolume >= minVolume){
	currentVolume=currentVolume - 1;
System.out.println("The current volume is" +currentVolume);
	}
	else {
	System.out.println("Min valume reached");
}
}else{
	System.out.println("Turn on the projector");
	
}
System.out.println("decrease volume is ended");	

}	
}	




