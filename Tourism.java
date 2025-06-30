class Tourism{
static String touristPlaces[]={"Lal Bagh","Mysore Palace","Abbey Falls","Dubare Elephant Camp","Bangalore Palace","Jog Falls","Udupi Sri Krishna Matha","Badami Cave Temples","Pattadakal Temple","Gol Gumbaz","Murudeshwar Temple","Chamundi Hills","Beluru Chennakeshava Temple","Shravanabelagola","Kuduremukh Peak"};

public static void main(String[] tourist){
System.out.println("main started");
//System.out.println("Tourist places in Karnataka : "+toursistPlaces.length);
//System.out.println(touristPlaces[0]+" "+touristPlaces[1]+" "+touristPlaces[2]+" "+touristPlaces[3]+" "+touristPlaces[3]+" "+touristPlaces[4]+" "+touristPlaces[5]+" "+touristPlaces[6]+" "+touristPlaces[7]+" "+touristPlaces[8]+" "+touristPlaces[9]+touristPlaces[10]+" "+touristPlaces[11]+" "+touristPlaces[12]+" "+touristPlaces[13]+" "+touristPlaces[14]);

System.out.println("Tourist places are :");
for(String touristPlace:touristPlaces)
{
	System.out.println(touristPlace);
}
System.out.println("main ended");
}
}