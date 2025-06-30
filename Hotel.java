class Hotel{
static String menu[] ={"Idli","Masal Dosa","Pulav","Biriyani","Poori","Noodles","Roti","Momos","Vada Pav","paratha","Pani Puri","Masala Puri","Maggi","Dal Tadka","Fish Fry","Chicken Curry","Paneer Butter Masala","Biriyani","Sandwich","Pasta","Aloo Paratha","Dhokla","Palak Paneer","Butter Chicken","Gobi Manchurian"}; 

public static void main(String[] foods){
System.out.println("main started");
//System.out.println("Menus are :" +menu.length);
//System.out.println(menu[0]+" "+menu[1]+" "+menu[2]+" "+menu[3]+" "+menu[3]+" "+menu[4]+" "+menu[5]+" "+menu[6]+" "+menu[7]+" "+menu[8]+" "+menu[9]+" "+menu[10]+" "+menu[11]+" "+menu[12]+" "+menu[13]+" "+menu[14]+" " +menu[15]+" "+menu[16]+" "+menu[17]+" "+menu[18]+" "+menu[19]+" "+menu[20]+" "+menu[21]+" "+menu[22]+" "+menu[23]+" "+menu[24]);
System.out.println("Menus added are :");
for(String menus:menu)
{
	System.out.println(menus);
}
System.out.println("main ended");

}
}