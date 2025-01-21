public class EnhancedForLoop{
	public static void main(String args[]){
		int[] numbers = {2,8,16,20,36};
		
		String[] names = {"cliton","solomon","delight","prize","decency"};
		
		for (int n:numbers){
			System.out.println(n);
		}
		
		for(String name : names){
			System.out.printf("%s%n",name);
		}
	}
}