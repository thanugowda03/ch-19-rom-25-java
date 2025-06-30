class City{

static String pincode[]={"Bangalore-560001","Mysore-570001","Mangalore-575001","Belgavi-590001","Dharwad-580001","Kalburgi-585101","Ballari-583101","Hassan-573201","Udupi-575001","Chikkamagaluru-577101","Vijayapura-586101","Tumkuru-572101","Davanagere-577001"};
public static void main(String[] number){
System.out.println("main started");
//System.out.println("City pincodes are "+pincode.length);
System.out.println("City pincodes are ;");
for(String pincode :pincode){
System.out.println(pincode);
}
//System.out.println(pincode[0]+" "+pincode[1]+" "+pincode[2]+" "+pincode[3]+" "+pincode[4]+" "+pincode[5]+" "+pincode[6]+" "+pincode[7]+" "+pincode[8]+" "+pincode[9]+" "+pincode[10]+" "+pincode[11]+" "+pincode[12]);
System.out.println("main ended");
}
}
