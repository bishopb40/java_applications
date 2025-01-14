public class AnnuelInterest{
 public static void main (String[] args){
	 
	 double amount ;
	 double principal = 1000.0;
	 double rate = 0.05;
	 
	 System.out.printf("%-5s %-20s%n", "year", "amount on deposit");
	 
	 for(int year = 1; year <=10; ++year){
		 amount = principal * Math.pow(1.0 + rate,year);
		 
		 System.out.printf("%-5d %-20.2f%n",year,amount);
	 }
	 
	 
 }
}