class Zepto {
public static double getOrder(String foodName) {
double price=0.0;
if (foodName == "Masala Puri") {
 price=50;
}
else if (foodName == "Burger") {
 price=165;
}
else if (foodName == "poatao manchurian") {
 price=160;
}
else if (foodName == "Rajma chawal") {
 price=129;
}
else if (foodName == "Choco Lava Cake") {
 price=79;
}
else if (foodName == "Moong Dal Halwai") {
 price=125;
}
else if (foodName == "Bhelpuri") {
 price=119;
}
else if (foodName == "Hot Chocolate") {
 price=135;
}
else if (foodName == "Veg Sandwich") {
 price=69;
}
else if (foodName == "Veg puff") {
 price=70;
}
else if (foodName == "Mango shake") {
 price=129;
}
else if (foodName == "Plain Curd") {
 price=38;
}
else if (foodName == "Cold Coffee") {
 price=69;
}
else if (foodName == "Kurkure") {
 price=20;
}
else if (foodName == "Masala Chaas") {
 price=99;
}
else if (foodName == "Plain Maggi Masala") {
 price=79;
}
else if (foodName == "Popcorn") {
 price=89;
 }
else if (foodName == "Butter Croissant") {
 price=129;
}
else if (foodName == "Crispy corn") {
 price=140;
}
else if (foodName == "Rawa Upma") {
 price=169;
}
else if (foodName == "Chicken Puff") {
 price=80;
}
else if (foodName == "Cabbage Manchurian") {
 price=139;
}
else if (foodName == "Masala Chai") {
 price=125;
}
else if (foodName == "Chicken curry") {
 price=200;
}
else if (foodName == "Mutton Curry") {
 price=265;
}
else if (foodName == "Mutton Biriyani") {
 price=240;
}
else if (foodName == "Chicken Tikka") {
 price=200;
}
else if (foodName == "Chicken Tikka") {
 price=269;
}
else if (foodName == "Wheat Chapati") {
 price=85;
}
else if (foodName == "Chicken Donne Biriyani") {
 price=170;
}
else 
System.out.println(foodName+ " is not found");
return price;
}
}