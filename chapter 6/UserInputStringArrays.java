import java.util.Scanner;

public class UserInputStringArrays{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String [] names = new String[5];
		
		for (int i = 0; i <5; i++){
			System.out.print("enter name: ");
			names[i] = scan.nextLine();
			
			
		}
		
		for (int i = 0; i <5; i++){
			System.out.printf("Element at index %d = %s%n",i,names[i]);
		}
	}
}