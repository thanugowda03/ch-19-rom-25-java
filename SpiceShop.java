class SpiceShop{

static String spices[]={"Turmeric","Cumin","Coriander","Black Pepper","Red Chiili Powder","Mustard Seeds","Fenugreek Seeds","Cardamom","Cinnamom","Cloves","Asafoetida","Bay Leaf","Carom Seeds","Ginger Paste"};
public static void main(String[] indianspices){

System.out.println("main started");
//System.out.println("Name of the spices are "+ spices.length);
//System.out.println(spices[0]+" "+spices[1]+" "+spices[2]+" "+spices[3]+" "+spices[4]+" "+spices[5]+" "+spices[6]+" "+spices[7]+" "+spices[8]+" "+spices[9]+" "+spices[10]+" "+spices[11]+" "+spices[12]+" "+spices[13]);
System.out.println("Name of the spices are ");
for(String spice:spices)
{
	System.out.println(spice);
}
System.out.println("main ended");
}
}

