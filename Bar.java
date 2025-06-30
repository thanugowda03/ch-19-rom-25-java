class Bar{

static String alcoholNames[]={"Royal Stag","Bapiper","Peter Scot","Old Monk","McDowell's No.1 Rum","Officer's Choice","Blenders Pride","Imperail Blue","Antiquity Blue","Rampur","Amrut Dusion","Kingfisher","Budweiser"};

public static void main(String[] alcohol){
System.out.println("main started");
//System.out.println("Alcohol names are "+alcoholNames.length);
//System.out.println(alcoholNames[0]+" "+alcoholNames[1]+" "+alcoholNames[2]+" "+alcoholNames[3]+" "+alcoholNames[4]+" "+alcoholNames[5]+" "+alcoholNames[6]+" "+alcoholNames[7]+" "+alcoholNames[8]+" "+alcoholNames[9]+" "+alcoholNames[10]+" "+alcoholNames[11]);
System.out.println("Alcohol names are ");
for(String alcoholName:alcoholNames)
{
System.out.println(alcoholName);
}
System.out.println("main ended");
}
}

