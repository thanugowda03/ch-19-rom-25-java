class Earth{
static String continents[]={"Asia","Africa","North America","South America","Anatarctica","Europe","Australia"};

public static void main(String[] seven){
System.out.println("main started");
//System.out.println("Earth Continents are "+continents.length);
//System.out.println(continents[0]+" "+continents[1]+" "+continents[2]+" "+continents[3]+" "+continents[4]+" "+continents[5]+" "+continents[6]);

System.out.println("Earth Continents are :");
for(String continent:continents)
{
	System.out.println(continent);
}
System.out.println("main ended");
}
}