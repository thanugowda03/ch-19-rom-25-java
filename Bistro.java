class Bistro {
public static double getOrder(String foodName) {
double price=0.0;
if (foodName == "Chilli chicken") {
 price=160;
}
else if (foodName == "Ragi ball") {
 price=65;
}
else if (foodName == "Bby corn manchurian") {
 price=160;
}
else if (foodName == "Rjma chawal") {
 price=129;
}
else if (foodName == "Plain paratha") {
 price=50;
}
else if (foodName == "Dal Makhani") {
 price=125;
}
else if (foodName == "Chole & Rice") {
 price=150;
}
else if (foodName == "Hot Chocolate") {
 price=135;
}
else if (foodName == "Chicken Tikka Sandwich") {
 price=169;
}
else if (foodName == "Grlic chicken") {
 price=250;
}
else if (foodName == "Mango shake") {
 price=129;
}
else if (foodName == "Chicken masala maggi") {
 price=135;
}
else if (foodName == "Coffee") {
 price=20;
}
else if (foodName == "Kurkure") {
 price=20;
}
else if (foodName == "Aloo Gobi") {
 price=120;
}
else if (foodName == "Egg Masala") {
 price=110;
}
else if (foodName == "Malai Kofta") {
 price=180;
 }
else if (foodName == "Matar Paneer") {
 price=120;
}
else if (foodName == "Crispy corn") {
 price=140;
}
else if (foodName == "Domino's pizza") {
 price=235;
}
else if (foodName == "Aloo Tikki") {
 price=100;
}
else if (foodName == "Gobi Manchurian") {
 price=139;
}
else if (foodName == "Butter Chicken") {
 price=175;
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
else if (foodName == "Chicken Kebab") {
 price=150;
}
else if (foodName == "Tandoori chicken") {
 price=185;
}
else if (foodName == "Chicken 65") {
 price=170;
}
else 
System.out.println(foodName+ " is not found");
return price;
}
}