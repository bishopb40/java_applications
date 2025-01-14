import java.util.Scanner;
public class MethodOverloading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("*****menu****");
		System.out.println("enter 1 to calculate perimeter of square : ");
		System.out.println("enter 2 to calculate perimeter of rectangle : ");
		int option = scan.nextInt();
		switch (option){
			case 1:
			{
			       System.out.print("Enter length of a square: ");
				   int length = scan.nextInt();
			       MethodOverloading.shape(length);
		    }
			break;
			
			case 2 : 
			{
			       System.out.print("Enter length of a rectangle: ");
				   int length = scan.nextInt();
				   
				   System.out.print("Enter length of a Breadth: ");
				   int breadth = scan.nextInt();
				   
				   
			       MethodOverloading.shape(length,breadth);
			}
			break;
			
			default :
			System.out.println("invalid input ");
		}
	}
	public static void shape(int length){
		int perimeterOfSquare = 4*length;
		System.out.printf("the perimeter of the Squre is %d", perimeterOfSquare);
		
	}
	public static void shape(int length ,int breadth){
		int perimeterOfResct = length * breadth;
		
		System.out.printf("the perimeter of a rectangle is %d" ,perimeterOfResct);
		
	}
}