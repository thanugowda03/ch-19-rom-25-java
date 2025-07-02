class PeriodicTable {
	/*static String one = "Hydrogen H";
	static String two = "Helium He"
	static String three = "Lithium Li"
	static String four = "Beryllium Be";
	static String five = "Boron B";
	static String six = "Carbor C";
	static String seven = "Nitrogen N";
	static String eight = "Oxygen O";
	static String nine = "Fluorine F";
	static String ten = "Neon Ne";
	static String eleven = "Sodium Na";
	static String twelve = "Magnesium";
static String elements[] ={one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve};*/

public static void main(String[] table){
	String one = "Hydrogen H";
	String two = "Helium He";
	String three = "Lithium Li";
	String four = "Beryllium Be";
	String five = "Boron B";
	String six = "Carbor C";
	String seven = "Nitrogen N";
	String eight = "Oxygen O";
	String nine = "Fluorine F";
	String ten = "Neon Ne";
	String eleven = "Sodium Na";
	String twelve = "Magnesium";
	String elements[] = {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve};
	System.out.println("main started");
	System.out.println("The Periodic Table elements are ");
	//System.out.println(elements[0] +" "+ elements[1] +" "+ elements[2] +" "+ elements[3] +" "+ elements[4] +" "+ elements[5] +" "+ elements[6] +" "+ elements[7] +" "+ elements[8] +" "+ elements[9] +" "+ elements[10] +" "+ elements[11]);
	for(String element : elements){
		System.out.println(element);
	}
	System.out.println("main ended");
}
}
