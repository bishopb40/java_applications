import java.util.Random;
import java.util.Scanner;


public class RandomUserNum{
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	Random random = new Random();

	
	System.out.print("enter number : ");
	
	int num = scan.nextInt(); 
	
	if (num == 0){
		System.out.println("the number must be greater than 0");
	}
	else {
	int randomnum = random.nextInt(num) + 1;
	System.out.printf("the random number is: %d%n", randomnum);
	}
	
	
    }
}