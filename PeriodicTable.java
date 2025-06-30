class PeriodicTable{

static String elements[]={"Hydrogen","Oxygen","Helium","Lithium","Boron","Carbon","Nitrogen","Neon","Sodium","Silicon","Sulfur","Argon"};

public static void main(String[] Table){
System.out.println("main started");
//System.out.println("Elements names are "+elements.length);
//System.out.println(elements[0]+" "+elements[1]+" "+elements[2]+" "+elements[3]+" "+elements[4]+" "+elements[5]+" "+elements[6]+" "+elements[7]+" "+elements[8]+" "+elements[9]+" "+elements[10]+" "+elements[11]);
System.out.println("main ended");
System.out.println("Elements names are ");
for(String element:elements)
{
	System.out.println(element);
}
System.out.println("main ended");
}
}

