 import java.util.Scanner;

public class ForLoop{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int score;
		int sumOfScore = 0;
		double average ;
		
		for (int i =1; i <=10;i++){
			
		
		System.out.print("Enter score: " );
		
		score = scan.nextInt();
		
		
		sumOfScore += score;
	    }
	average = (double)sumOfScore/10;
	System.out.printf("the score average is %.2f", average);
	
	}
}