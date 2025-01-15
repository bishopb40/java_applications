import java.util.Random;


public class RandomNumbers{
	public static void main(String args[]){
		Random random = new Random();
		
		int randomNum = random.nextInt();
		
		System.out.printf("the randomnumber is %d%n", randomNum);
		
		int randomNumInRange = random.nextInt(20)+1;
		
		System.out.printf("random Number in Range is : %d%n ", randomNumInRange);
		
		
		double floatpointnum = random.nextDouble();
		
		System.out.printf ("random double number is:%.2f%n",floatpointnum);
		
		double min = 10.0;
		double max = 20.0;
		
		
		double randomfloatPointInRange = min + (max - min)* random.nextDouble();
		
		System.out.printf("random double number in range is: &.2f%n", randomfloatPointInRange);
		
		
		boolean booleanValue = random.nextBoolean();
		
		System.out.printf("random boolean value is: %b%n",booleanValue);
		
		
	}
}