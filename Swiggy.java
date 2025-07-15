class Swiggy {
public static double getOrder(String foodName) {
double price=0.0;
if (foodName == "Masal Dosa") {
 price=80;
}
else if (foodName == "Buns") {
 price=65;
}
else if (foodName == "Sada Dosa") {
 price=70;
}
else if (foodName == "Upma") {
 price=40;
}
else if (foodName == "Pulav") {
 price=65;
}
else if (foodName == "Badam Shake") {
 price=75;
}
else if (foodName == "WaterMelon Juice") {
 price=50;
}
else if (foodName == "Chapati with curry") {
 price=100;
}
else if (foodName == "South Indian Meals") {
 price=120;
}
else if (foodName == "Thali") {
 price=100;
}
else if (foodName == "Pav Bhaji") {
 price=148;
}
else if (foodName == "Chole Bhature") {
 price=170;
}
else if (foodName == "Paneer Butter Masala") {
 price=199;
}
else if (foodName == "Aloo Paratha") {
 price=65;
}
else if (foodName == "Roti Curry") {
 price=220;
}
else if (foodName == "Curd rice") {
 price=110;
}
else if (foodName == "Kulcha Curry") {
 price=140;
 }
else if (foodName == "Naan Curry") {
 price=120;
}
else if (foodName == "Channa Bhatura") {
 price=160;
}
else if (foodName == "Veg Dum Biriyani") {
 price=220;
}
else if (foodName == "Paneer Tikka") {
 price=180;
}
else if (foodName == "Paneer Lassoni") {
 price=180;
}
else if (foodName == "Veg Kadhai") {
 price=175;
}
else if (foodName == "Paneer Tikka Masala") {
 price=200;
}
else if (foodName == "Dal Makhani") {
 price=165;
}
else if (foodName == "Idli") {
 price=40;
}
else if (foodName == "Paneer Tikka Masala") {
 price=200;
}
else if (foodName == "Vada") {
 price=45;
}
else if (foodName == "Pongal") {
 price=45;
}
else if (foodName == "Akki Roti") {
 price=70;
}
else 
System.out.println(foodName+ "Food name is found");

return price;
}
}