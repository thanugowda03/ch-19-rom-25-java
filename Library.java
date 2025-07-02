class Library {
	/*static String grave = "Daughters of the Bamboo Grave";
	static String the = "The Library book";
	static String everthing = "Everthing is Tuberculosis";
	static String invusible = "The Invusible Library";
	static String kite = "The Kite Runner";
	static String crash = "The Crash";
	static String listener = "The Listeners";
	static String battle = "battle of the Bookstores";

static String bookNames[] ={grave,the,everthing,invusible,kite,crash,listener,battle};*/

public static void main(String[] book){
	String grave = "Daughters of the Bamboo Grave";
	String the = "The Library book";
	String everthing = "Everthing is Tuberculosis";
	String invusible = "The Invusible Library";
	String kite = "The Kite Runner";
	String crash = "The Crash";
	String listener = "The Listeners";
	String battle = "battle of the Bookstores";
	String bookNames[] = {grave,the,everthing,invusible,kite,crash,listener,battle};
	System.out.println("main started");
	System.out.println("The Library book Names are ");
	//System.out.println(bookNames[0] +" "+ bookNames[1] +" "+ bookNames[2] +" "+ bookNames[3] +" "+ bookNames[4] +" "+ bookNames[5] +" "+ bookNames[6] +" "+ bookNames[7]);
	for(String bookName : bookNames){
		System.out.println(bookName);
	}
	System.out.println("main ended");
}
}
