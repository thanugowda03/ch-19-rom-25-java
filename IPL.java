class IPL{
/*static String rcb="RCB";
static String mi="MI";
static String csk="CSK";
static String lsg="LSG";
static String dc="DC";
static String kkr="KKR";
static String gt="GT";
static String pbks="PBKS";
static String rr="RR";
static String srh="SRH";

static String teamNames[]={"RCB","MI","CSK","LSG","DC","KKR","GT","PBKS","RR","SRH"};*/

public static void main(String[] teams){
System.out.println("main started");
//System.out.println("IPL Team Names are "+teamNames.length);
//System.out.println(teamNames[0]+" "+teamNames[1]+" "+teamNames[2]+" "+teamNames[3]+" "+teamNames[4]+" "+teamNames[5]+" "+teamNames[6]+" "+teamNames[7]+" "+teamNames[8]+" "+teamNames[9]);
String rcb="RCB";
String mi="MI";
String csk="CSK";
String lsg="LSG";
String dc="DC";
String kkr="KKR";
String gt="GT";
String pbks="PBKS";
String rr="RR";
String srh="SRH";

String teamNames[]={"RCB","MI","CSK","LSG","DC","KKR","GT","PBKS","RR","SRH"};
//looping structure
for(String teamName :teamNames) {
System.out.println(teamName);	
}
System.out.println("main ended");


}


}