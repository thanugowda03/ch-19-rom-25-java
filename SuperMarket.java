class SuperMarket{

/*static String vanillaIceCream="Vanilla Ice Cream";
static String chocolateIceCream="Chocolate Ice Cream";
static String strawberryIceCream="Strawberry Ice Cream";
static String butterscotchIceCream="Butterscotch Ice Cream";
static String mangoIceCream="Mango Ice Cream";
static String blackCurrantIceCream="Black Currant Ice Cream";
static String kulfi = "Kulfi";
static String caramelIceCream="Caramel Ice Cream";
static String pistachioIceCream="Pistachio Ice Cream";
static String tuttiFruittiIceCream="Tutti Fruitti Ice Cream";
static String iceCreams[]={vanillaIceCream,chocolateIceCream,strawberryIceCream,butterscotchIceCream,mangoIceCream,blackCurrantIceCream,kulfi,caramelIceCream,pistachioIceCream,tuttiFruittiIceCream};

static String fogg="Fogg";
static String engage="Engage";
static String axe="Axe";
static String nivea="Nivea";
static String setWet="Set Wet";
static String layerShot="LayerShot";
static String denever="Denver";
static String skinByTitan="Skin By Titan";
static String beardo="Beardo";
static String parkAvenue="Park Avenue";
static String perfumes[]={fogg,engage,axe,nivea,setWet,layerShot,denever,skinByTitan,beardo,parkAvenue};


static String rice="Rice";
static String wheatFlour="Wheat Flour";
static String sugar="Sugar";
static String salt="Salt";
static String milk="Milk";
static String uradDal="Urad Dal";
static String moongDal="Moong Dal";
static String jaggery="Jaggery";
static String chanaDal="Chana Dal";
static String teaPowder="Tea Powder";
static String groceries[]={rice,wheatFlour,sugar,salt,milk,uradDal,moongDal,jaggery,chanaDal,teaPowder};

static String foundation="Foundation";
static String compactPowder="Compact Powder";
static String blush="Blush";
static String highLighter="High Lighter";
static String primer="Primer";
static String bbCream="BB Cream";
static String eyeLiner="Eye Liner";
static String lipstick="Lipstick";
static String lipBalm="Lip Balm";
static String nailPolish="Nail Polish";
static String cosmetics[]={foundation,compactPowder,blush,highLighter,primer,bbCream,eyeLiner,lipstick,lipBalm,nailPolish};*/


/*static String iceCreams[]={"vanillaIceCream,chocolateIceCream,strawberryIceCream,butterscotchIceCream,mangoIceCream,blackCurrantIceCream,kulfi,caramelIceCream,pistachioIceCream,tuttiFriuttiIceCream};
static String perfumes[]={"Fogg","Engage","Axe","Nivea","Set Wet","Layer's Shot","Denver","Skin by Titan","Beardo","Park Avenue"};
static String groceries[]={"Rice","Wheat Flour","Sugar","Salt","Milk","Urad Dal","Moong Dal","Jaggery","Chana Dal","Tea Powder"};
static String cosmetics[]={"Foundation","Compact Powder","Blush","Highlighter","Primer","BB Cream","Eyeliner","Lipstick","Lip Balm","Nail Polish"};*/

public static void main(String[] market) {

System.out.println("main started");

String vanillaIceCream="Vanilla Ice Cream";
String chocolateIceCream="Chocolate Ice Cream";
String strawberryIceCream="Strawberry Ice Cream";
String butterscotchIceCream="Butterscotch Ice Cream";
String mangoIceCream="Mango Ice Cream";
String blackCurrantIceCream="Black Currant Ice Cream";
String kulfi = "Kulfi";
String caramelIceCream="Caramel Ice Cream";
String pistachioIceCream="Pistachio Ice Cream";
String tuttiFruittiIceCream="Tutti Fruitti Ice Cream";
String iceCreams[]={vanillaIceCream,chocolateIceCream,strawberryIceCream,butterscotchIceCream,mangoIceCream,blackCurrantIceCream,kulfi,caramelIceCream,pistachioIceCream,tuttiFruittiIceCream};


String fogg="Fogg";
String engage="Engage";
String axe="Axe";
String nivea="Nivea";
String setWet="Set Wet";
String layerShot="LayerShot";
String denever="Denver";
String skinByTitan="Skin By Titan";
String beardo="Beardo";
String parkAvenue="Park Avenue";
String perfumes[]={fogg,engage,axe,nivea,setWet,layerShot,denever,skinByTitan,beardo,parkAvenue};

String rice="Rice";
String wheatFlour="Wheat Flour";
String sugar="Sugar";
String salt="Salt";
String milk="Milk";
String uradDal="Urad Dal";
String moongDal="Moong Dal";
String jaggery="Jaggery";
String chanaDal="Chana Dal";
String teaPowder="Tea Powder";
String groceries[]={rice,wheatFlour,sugar,salt,milk,uradDal,moongDal,jaggery,chanaDal,teaPowder};

String foundation="Foundation";
String compactPowder="Compact Powder";
String blush="Blush";
String highLighter="High Lighter";
String primer="Primer";
String bbCream="BB Cream";
String eyeLiner="Eye Liner";
String lipstick="Lipstick";
String lipBalm="Lip Balm";
String nailPolish="Nail Polish";
String cosmetics[]={foundation,compactPowder,blush,highLighter,primer,bbCream,eyeLiner,lipstick,lipBalm,nailPolish};


/*System.out.println("Available Ice Cream names in Super Market "+iceCreams.length);
System.out.println(iceCreams[0]+" "+iceCreams[1]+" "+iceCreams[2]+" "+iceCreams[3]+" "+iceCreams[3]+" "+iceCreams[4]+" "+iceCreams[5]+" "+iceCreams[6]+" "+iceCreams[7]+" "+iceCreams[8]+" "+iceCreams[9]);
System.out.println("Available Perfume brands are "+perfumes.length);
System.out.println(perfumes[0]+" "+perfumes[1]+" "+perfumes[2]+" "+perfumes[3]+" "+perfumes[3]+" "+perfumes[4]+" "+perfumes[5]+" "+perfumes[6]+" "+perfumes[7]+" "+perfumes[8]+" "+perfumes[9]);
System.out.println("Available groceries are "+groceries.length);
System.out.println(groceries[0]+" "+groceries[1]+" "+groceries[2]+" "+groceries[3]+" "+groceries[3]+" "+groceries[4]+" "+groceries[5]+" "+groceries[6]+" "+groceries[7]+" "+groceries[8]+" "+groceries[9]);
System.out.println("Available Cosmetics brands are "+cosmetics.length);
System.out.println(cosmetics[0]+" "+cosmetics[1]+" "+cosmetics[2]+" "+cosmetics[3]+" "+cosmetics[3]+" "+cosmetics[4]+" "+cosmetics[5]+" "+cosmetics[6]+" "+cosmetics[7]+" "+cosmetics[8]+" "+cosmetics[9]); */

System.out.println("Available Ice Cream names are :");
for(String iceCream:iceCreams)
{
	System.out.println(iceCream);
}

System.out.println("Available Perfume names are :");
for(String perfume:perfumes)
{
	System.out.println(perfume);
}

System.out.println("Available Groceries are :");
for(String grocery:groceries)
{
	System.out.println(grocery);
}

System.out.println("Available Cosmetics names are :");
for(String cosmetic:cosmetics)
{
	System.out.println(cosmetic);
}

System.out.println("main ended");


}
}