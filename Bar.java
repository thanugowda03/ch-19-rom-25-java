class Bar {
	/*static String old = "Old Fashioned";
	static String margarita = "Margarita";
	static String moji = "Mojito";
	static String mule = "Moscow Mule";
	static String roni = "Negroni";
	static String daiquiri = "Daiquiri";
	static String sour = "Whiskey Sour";
	static String martini ="Martini"; 
	static String cosmopolitan = "Cosmopolitan";
	static String mary = "Bloody Mary";
	static String colada = "Pina Colada";
	static String gin = "Gin and Tonic";
static String alcoholNames[] = {"Old Fashioned","Margarita","Mojito","Moscow Mule","Negroni","Daiquiri","Whiskey Sour","Martini","Cosmopolitan","Bloody Mary","Pina Colada","Gin and Tonic"};*/

public static void main(String[] alcohol){
	String old = "Old Fashioned";
	String margarita = "Margarita";
	String moji = "Mojito";
	String mule = "Moscow Mule";
	String roni = "Negroni";
	String daiquiri = "Daiquiri";
	String sour = "Whiskey Sour";
	String martini ="Martini"; 
	String cosmopolitan = "Cosmopolitan";
	String mary = "Bloody Mary";
	String colada = "Pina Colada";
	String gin = "Gin and Tonic";
	String alcoholNames[] ={old,margarita,moji,mule,roni,daiquiri,sour,martini,cosmopolitan,mary,colada,gin};
	System.out.println("main started");
	System.out.println("Alcohol Names are ");
	//System.out.println(alcoholNames[0] +" "+ alcoholNames[1] +" "+ alcoholNames[2] +" "+ alcoholNames[3] +" "+ alcoholNames[4] +" "+ alcoholNames[5] +" "+ alcoholNames[6] +" "+ alcoholNames[7] +" "+ alcoholNames[8] +" "+ alcoholNames[9] +" "+ alcoholNames[10] +" "+ alcoholNames[11]);
	for (String alcoholName : alcoholNames){
		System.out.println(alcoholName);
	}
	System.out.println("main ended");
}
}

