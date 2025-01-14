import java.util.Scanner;

public class Constants{
 static final double pi = 3.142;
 
 static int h = 50;
 
 public static void main(String[] args){
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.print("enter radius:");
	 
	 int radius = scan.nextInt();
	 
	 Constants.area(radius);
 }
 public static void area(int radius){
	 double areaOfCircle = pi * radius * radius;
	 System.out.printf("the area of the circle is %.2f%n",areaOfCircle);
	 
	 Constants.check();
	 
 }
 public static void check(){
	 if(h >=18)
	 System.out.println("yes, you are an adult");
	 
	 else 
		 System.out.println("you are still a teenager");
 }
}