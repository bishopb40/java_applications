import java.util.Scanner;

public class ArrayManipulation{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[5];
		
		int sum = 0;
		
		
		for (int i = 0; i <5; i++){
		System.out.print("enter number: ");
		numbers[i] = scan.nextInt();
		
		
		sum+=numbers[i];
		}
		
		System.out.printf("the total number is %d" ,sum);
	}
}