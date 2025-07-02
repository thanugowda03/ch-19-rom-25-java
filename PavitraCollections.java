class PavitraCollections{

/*static String miniBoden="Mini Boden";
static String youngDays="Young Days";
static String kyteBaby="Kyte Baby";
static String poshPeanut="Posh Peanut";
static String zara="Zara";
static String brandNames[]={miniBoden,youngDays,kyteBaby,poshPeanut,zara};*/

public static void main(String[] brand){
System.out.println("main started");
String miniBoden="Mini Boden";
String youngDays="Young Days";
String kyteBaby="Kyte Baby";
String poshPeanut="Posh Peanut";
String zara="Zara";
String brandNames[]={miniBoden,youngDays,kyteBaby,poshPeanut,zara};
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

