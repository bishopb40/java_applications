import java.util.Scanner;


public class SwitchStateMent{
	public static void main(String[] args){
	Scanner scan = new Scanner (System.in);
	
	String name;
	int score;
	
	System.out.print("Enter name: ");
	name = scan.nextLine();
	
	System.out.print("Enter score: ");
	score = scan.nextInt();
	
	switch (score/10){
		case 10:
		case 9:
		       System.out.println(name + " your grade is outstanding");
		
		break;
		
		case 8:
		case 7:
		case 6:
		       System.out.println(name + " your grade is Excellent");
			   
		break;
		
		case 5:
		       System.out.println(name + " your grade is good");
			   
	    break;
		
		
		case 4:
		       System.out.println(name + " your grade is avarage");
			   
	    break;
		
		case 3:
		case 2:
		case 1:
		case 0:
		       System.out.println(name + " your grade is poor");
			   
	    break;
		
		default :
		         System.out.println(name + "good");
	}
	
	}	   
}