class Zomato {
public static double getOrder(String foodName) {
double price=0.0;
if (foodName == "Poori") {
 price=60;
}
else if (foodName == "Ragi Roti") {
 price=65;
}
else if (foodName == "Kadai Paneer") {
 price=100;
}
else if (foodName == "Butter chicken") {
 price=350;
}
else if (foodName == "Pav Bhaji") {
 price=139;
}
else if (foodName == "Dum Chicken Biryani") {
 price=375;
}
else if (foodName == "Tandoori Roti") {
 price=50;
}
else if (foodName == "Vegetarian Thali") {
 price=100;
}
else if (foodName == "Samosa") {
 price=20;
}
else if (foodName == "Rolls") {
 price=50;
}
else if (foodName == "Gulab Jamun") {
 price=99;
}
else if (foodName == "Kesar Rasamali") {
 price=135;
}
else if (foodName == "Tea") {
 price=20;
}
else if (foodName == "Lassi") {
 price=65;
}
else if (foodName == "Aloo Gobi") {
 price=120;
}
else if (foodName == "Bhindi Masala") {
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
else if (foodName == "Papad") {
 price=35;
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