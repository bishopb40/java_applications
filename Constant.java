import java.util.Scanner;

public class Constant{
 public static final double PI = Math.PI;
 
 public static double area(double
 radius){
	 return PI * radius * radius;
 }
}

public class CircleArea{
	public static void main(String[] args){
		
		Scanner Scan = new Scanner(System.in);
		
		System.out.print("enter the radius of the circle:");
		
		double radius = scan.nextDouble();
		
		double area = Constant.area(radius);
		
		
		System.out.println("The area of the circle is: " + area);
		
	}
}