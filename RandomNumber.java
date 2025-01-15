import java.util.Random;


public class RandomNumbers{
	public static void main(String args[]){
		Random random = new Random();
		
		int randomNum = random.nextInt();
		
		System.out.printf("the randomnumber is %d", randomNum);
		
		int randomNumInRange = random.nextInt(20)+1;
		
		System.out.printf("random Number in Range is : %d%n ", randomNumInRange);
		
		
		double floatpointnum = random.nextDouble();
		System.out.printf ("random double number is:%2.f%n",floatpointnum);
	}
}