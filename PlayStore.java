class PlayStore{

static String appNames[]={"WhatsApp Messenger","Instagram","Facebook","Telegram","Snapchat","YouTube","Netflix","MX Player","Spotify","Amazon"};

public static void main(String[] apps){
System.out.println("main started");
//System.out.println("Playstore apps are "+appNames.length);
//System.out.println(appNames[0]+" "+appNames[1]+" "+appNames[2]+" "+appNames[3]+" "+appNames[4]+" "+appNames[5]+" "+appNames[6]+" "+appNames[7]+" "+appNames[8]+" "+appNames[9]);
System.out.println("Play store are ");
for(String appName:appNames)
{
	System.out.println(appName);
}
System.out.println("main ended");
}
}
