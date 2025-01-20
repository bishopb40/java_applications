import java.security.SecureRandom;

public class DiceRoll{
	public static void main(String args[]){
		SecureRandom randomNumbers = new SecureRandom();
		
		int dieroll = randomNumbers.nextInt(6)+1;
		System.out.println("you rolled a: " + dieroll);
	}
}