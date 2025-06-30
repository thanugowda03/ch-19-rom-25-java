class Library{

static String bookNames[]={"Varana","Parva","Avadhoota","Malegalalli Madhumagalu","Chidambara Rahasya","Samskara","Mankuthimmana Kagga","Ganapati"};

public static void main(String[] books){
System.out.println("main started");
//System.out.println("Books names are "+bookNames.length);
//System.out.println(bookNames[0]+" "+bookNames[1]+" "+bookNames[2]+" "+bookNames[3]+" "+bookNames[4]+" "+bookNames[5]+" "+bookNames[6]+" "+bookNames[7]);
System.out.println("Books names are ");
for(String bookName:bookNames)
{
	System.out.println(bookName);
}
System.out.println("main ended");
}
}
