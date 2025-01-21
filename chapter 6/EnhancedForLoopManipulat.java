import java.util.Scanner;

public class EnhancedForLoopManipulat{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[10];
	    int pro = 1;

		
		for (int n : numbers){
			System.out.print("enter a number %d%n: ");
			numbers[n]=scan.nextInt();
			
			pro*=numbers[n];
			
			
		}
		System.out.printf("the product of all the number is %d",pro);
	}
}