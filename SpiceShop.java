class SpiceShop{

static String turmeric="Turmeric";
static String cumin="Cumin";
static String coriander="Coriander";
static String blackPepper="Black Pepper";
static String redChilliPowder="Red Chilli Powder";
static String mustardSeeds="Mustard Seeds";
static String fenugreekSeeds="Fenugreek Seeds";
static String cardamom="Cardamom";
static String cloves="Cloves";
static String asafoetida="Asafoetida";
static String bayLeaf="Bay Leaf";
static String caromSeeds="Carom Seeds";
static String cinnamom="Cinnamom";
static String gingerPaste="Ginger Paste";
static String spices[]={turmeric,cumin,coriander,blackPepper,redChilliPowder,mustardSeeds,fenugreekSeeds,cardamom,cinnamom,cloves,asafoetida,bayLeaf,caromSeeds,gingerPaste};
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

