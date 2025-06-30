class SuperMarket{
static String iceCreams[]={"Vanilla Ice Cream","Chocolate Ice Cream","Strawberry Ice Cream","Butterscotch Ice Cream","Mango Ice Cream","Black Currant Ice Cream","Kulfi","Caramel Ice Cream","Pistachio Ice Cream","Tutti Friutti Ice Cream"};
static String perfumes[]={"Fogg","Engage","Axe","Nivea","Set Wet","Layer's Shot","Denver","Skin by Titan","Beardo","Park Avenue"};
static String groceries[]={"Rice","Wheat Flour","Sugar","Salt","Milk","Urad Dal","Moong Dal","Jggery","Chana Dal","Tea Powder"};
static String cosmetics[]={"Foundation","Compact Powder","Blush","Highlighter","Primer","BB Cream","Eyeliner","Lipstick","Lip Balm","Nail Polish"};

public static void main(String[] market) {

System.out.println("main started");

/*System.out.println("Available Ice Cream names in Super Market "+iceCreams.length);
System.out.println(iceCreams[0]+" "+iceCreams[1]+" "+iceCreams[2]+" "+iceCreams[3]+" "+iceCreams[3]+" "+iceCreams[4]+" "+iceCreams[5]+" "+iceCreams[6]+" "+iceCreams[7]+" "+iceCreams[8]+" "+iceCreams[9]);
System.out.println("Available Perfume brands are "+perfumes.length);
System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+perfumes[3]+" "+perfumes[4]+" "+perfumes[5]+" "+perfumes[6]+" "+perfumes[7]+" "+perfumes[8]+" "+perfumes[9]);
System.out.println("Available groceries are "+groceries.length);
System.out.println(groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[3]+" "+groceries[4]+" "+groceries[5]+" "+groceries[6]+" "+groceries[7]+" "+groceries[8]+" "+groceries[9]);
System.out.println("Available Cosmetics brands are "+cosmetics.length);
System.out.println(cosmetics[0]+" "+cosmetics[1]+" "+cosmetics[2]+" "+cosmetics[3]+" "+cosmetics[3]+" "+cosmetics[4]+" "+cosmetics[5]+" "+cosmetics[6]+" "+cosmetics[7]+" "+cosmetics[8]+" "+cosmetics[9]); */

System.out.println("Available Ice Cream names are ");
for(String iceCream:iceCreams)
{
	System.out.println(iceCream);
}

System.out.println("Available Perfume names are ");
for(String perfume:perfumes)
{
	System.out.println(perfume);
}

System.out.println("Available Groceries are ");
for(String groceries:groceries)
{
	System.out.println(groceries);
}

System.out.println("Available Cosmetics names are ");
for(String cosmetic:cosmetics)
{
	System.out.println(cosmetic);
}

System.out.println("main ended");


}
}