class Calculator{


public static void main(String[] numbers) {
add(67, 78);
add(50,100);
sub(100,50);
sub(112, 110);
mul(46, 78);
mul(10,10);
div(100,5);
div(789, 56);
mod(100,10);
mod(112 , 34);

}

public static void add(int num1, int num2) {
int total=num1+num2;
System.out.println(total);
}
public static void sub(int num1, int num2) {
int total1= num1-num2;
System.out.println(total1);
}
public static void mul(int num1, int num2) {
int total2= num1*num2;
System.out.println(total2);
}
public static void div(int num1, int num2) {
int total3= num1/num2;
System.out.println(total3);
}
public static void mod(int num1, int num2) {
int total4= num1%num2;
System.out.println(total4);
}
}