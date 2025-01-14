import java.util.Scanner;

public class StaticMethod{
 public static void main(String[] args){
	 Scanner scan = new Scanner(System.in);
	 StaticMethod.sum();
	 StaticMethod.divide(120,45);
	 System.out.println(StaticMethod.product());
	 System.out.print("enter full name:");
	 String name = scan.nextLine();
	 
	 System.out.println(StaticMethod.personname(name));
	 
 }
 public static void sum(){
	 int x = 50;
	 int y = 30;
	 int total = x + y;
	 
	 System.out.printf("sum of the two number is %d%n", total);
 }
 public static void divide(int x, int y){
	 double total = (double)x/y;
	 System.out.printf("the second sum of the two number is %.2f%n", total);
 }
 public static int product(){
	 int x = 50;
	 int y = 10;
	 int total;
	return total = x * y;
 }
 public static String personname(String FullName){
	 return FullName;
 }
}