class Hospital{
/*static String himakara="Dr.Himakara";
static String bhanumati="Dr.Bhanumati";
static String haraprasad="Dr.Haraprasad";
static String archana="Dr.Archana";
static String shankar="Dr.Shankar";
static String rajaram="Dr.Rajaram";
static String raghurama="Dr.Raghurama";
static String jyotiRPrasad="Dr.Jyoti R Prasad";
static String chidananda="Dr.Chidananda";
static String renukaPrasad="Dr.Renuka Prasad";

static String doctorNames[]={himakara,bhanumati,haraprasad,archana,shankar,rajaram,raghurama,jyotiRPrasad,chidananda,renukaPrasad};*/

public static void main(String[] names){
System.out.println("main started");
String himakara="Dr.Himakara";
String bhanumati="Dr.Bhanumati";
String haraprasad="Dr.Haraprasad";
String archana="Dr.Archana";
String shankar="Dr.Shankar";
String rajaram="Dr.Rajaram";
String raghurama="Dr.Raghurama";
String jyotiRPrasad="Dr.Jyoti R Prasad";
String chidananda="Dr.Chidananda";
String renukaPrasad="Dr.Renuka Prasad";

String doctorNames[]={himakara,bhanumati,haraprasad,archana,shankar,rajaram,raghurama,jyotiRPrasad,chidananda,renukaPrasad};
//System.out.println("Doctors names are "+doctorNames.length);
//System.out.println(doctorNames[0]+" "+doctorNames[1]+" "+doctorNames[2]+" "+doctorNames[3]+" "+doctorNames[4]+" "+doctorNames[5]+" "+doctorNames[6]+" "+doctorNames[7]+" "+doctorNames[8]+" "+doctorNames[9]);
System.out.println("Doctors names are");
for(String doctorName:doctorNames)
{
	System.out.println(doctorName);
}

System.out.println("main ended");
}
}
