import java.util.Scanner;

public class WwhileLoop{
 public static void main(String[] args){
	 Scanner scan = new Scanner(System.in);
	 
	 
	 int score;
	 int SumOfScore = 0;
	 double average ;
	 int a = 0;
	 
	 while (a <=7){
		 
		 
		 System.out.print("enter number : ");
		 
		 score = scan.nextInt();
		 
		 
		 SumOfScore += score ;
		 
		 a++;
	 }
	 average = (double)SumOfScore/10;
	 System.out.printf("the score average  is %.2f",average);
	
	 
     
 }
}