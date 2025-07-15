class SwiggyRunner {

public static void main(String food[]) {
String foodName="Masal Dosa";
double price =Swiggy.getOrder(foodName);
System.out.println("Food "+foodName+ " price is "+price);
}
}