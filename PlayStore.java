class PlayStore{

/*static String whatsAppMessenger="WhatsApp Messenger";
static String instagram="Instagram";
static String facebook="Facebook";
static String telegram="Telegram";
static String snapchat="snapchat";
static String youTube="youTube";
static String netflix="Netflix";
static String mxPlayer="MX Player";
static String spotify="Spotify";
static String amazon="Amazon";
static String appNames[]={whatsAppMessenger,instagram,facebook,telegram,snapchat,youTube,netflix,mxPlayer,spotify,amazon};*/

public static void main(String[] apps){
System.out.println("main started");
String whatsAppMessenger="WhatsApp Messenger";
String instagram="Instagram";
String facebook="Facebook";
String telegram="Telegram";
String snapchat="snapchat";
String youTube="youTube";
String netflix="Netflix";
String mxPlayer="MX Player";
String spotify="Spotify";
String amazon="Amazon";
String appNames[]={whatsAppMessenger,instagram,facebook,telegram,snapchat,youTube,netflix,mxPlayer,spotify,amazon};
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
