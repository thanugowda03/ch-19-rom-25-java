class Earth{
	
/*static String asia="Asia";
static String africa ="Africa";
static String northAmerica="North Ameriaca";
static String southAmerica="South America";
static String antarctica="Antarctica";
static String europe="Europe";
static String australia="Australia";
static String continents[]={asia,africa,northAmerica,southAmerica,antarctica,europe,australia};*/

public static void main(String[] seven){
System.out.println("main started");
//System.out.println("Earth Continents are "+continents.length);
//System.out.println(continents[0]+" "+continents[1]+" "+continents[2]+" "+continents[3]+" "+continents[4]+" "+continents[5]+" "+continents[6]);
String asia="Asia";
String africa ="Africa";
String northAmerica="North Ameriaca";
String southAmerica="South America";
String antarctica="Antarctica";
String europe="Europe";
String australia="Australia";
String continents[]={asia,africa,northAmerica,southAmerica,antarctica,europe,australia};


System.out.println("Earth Continents are :");
for(String continent:continents)
{
	System.out.println(continent);
}
System.out.println("main ended");
}
}