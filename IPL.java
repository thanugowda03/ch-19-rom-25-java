class IPL{

static String teamNames[]={"RCB","MI","CSK","LSG","DC","KKR","GT","PBKS","RR","SRH"};

public static void main(String[] teams){
System.out.println("main started");
System.out.println("IPL Team Names are "+teamNames.length);
//System.out.println(teamNames[0]+" "+teamNames[1]+" "+teamNames[2]+" "+teamNames[3]+" "+teamNames[4]+" "+teamNames[5]+" "+teamNames[6]+" "+teamNames[7]+" "+teamNames[8]+" "+teamNames[9]);

//looping structure
for(String teamName :teamNames) {
System.out.println(teamName);	
}
System.out.println("main ended");


}


}