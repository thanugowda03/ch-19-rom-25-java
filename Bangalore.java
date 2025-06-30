class Bangalore{

static String areaNames[]={"Rajaji Nagar","RR Nagar"};

public static void main(String[] area){
System.out.println("main started");
//System.out.println("Areas in Bangalore are "+areaNames.length);
//System.out.println(areaNames[0]+" "+areaNames[1]);
System.out.println("Areas in Bangalore ");
for(String areaName:areaNames)
{
	System.out.println(areaName);
}

System.out.println("main ended");
}


}