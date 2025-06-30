class JuiceShop{

static String juices[]={"Orange juice","Apple juice","Grape Juice","Mango Juice","Pineapple Juice","Pomagranate Juice","Watermelon Juice","Guava Juice","Papaya Juice","Litchi","Lemon Juice","Sugarcane Juice","Mint-LimeJuice","Chikoo Juice","Banana Milkshake"};

public static void main (String[] fruits){

System.out.println("main started");
//System.out.println("Name of the juices are "+juices.length);
//System.out.println(juices[0]+" "+juices[1]+" "+juices[2]+" "+juices[3]+" "+juices[4]+" "+juices[5]+" "+juices[6]+" "+juices[7]+" "+juices[8]+" "+juices[9]+" "+juices[10]+" "+juices[11]+" "+juices[12]+" "+juices[13]+" "+juices[14]);

System.out.println("Available juice names are :");
for(String juice:juices)
{
	System.out.println(juice);
}
System.out.println("main ended");
}
}