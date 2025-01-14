 import java.util.Scanner;
 
public class NestedIfStatement{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		
		int score;
		String name;
		
		System.out.print("enter your name: ");
		name = scan.nextLine();
		
		
		System.out.print("enter your score: ");
		score = scan.nextInt();
		
		if(score >= 90)
			System.out.println(name + " your grade is outstanding");
		
		else if(score >= 75)
			System.out.println(name + " your grade is Excellent");
		
		
		else if(score >= 55)
			System.out.println(name + " your grade is Good");
		
		else if(score >= 45)
			System.out.println(name + " your grade is Avarage");
		
		else
	       System.out.println(name + " your grade is very poor");
		
	}	   
}