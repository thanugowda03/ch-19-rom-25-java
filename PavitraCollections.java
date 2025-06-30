class PavitraCollections{

static String brandNames[]={"Mini Boden","Young Days","Kyte Baby","Posh Peanut","Zara"};

public static void main(String[] brand){
System.out.println("main started");
//System.out.println("Brand names are "+brandNames.length);
//System.out.println(brandNames[0]+" "+brandNames[1]+" "+brandNames[2]+" "+brandNames[3]+" "+brandNames[4]);
System.out.println("Brand names are :");
for(String brandName:brandNames)
{
	System.out.println(brandName);
}
System.out.println("main ended");
}
}

