public class MathFuntion{
public static void main(String args[]){
	
	double x = Math.abs(7.5);
	double y = Math.floor(7.5); 
	double r = Math.abs(0.0); 
	double h = Math.ceil(0.0); 
	double u = Math.abs(-6.4); 
	double s = Math.ceil(-6.4); 
	double b = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));

	
	
	System.out.printf("the math.abs is: %.2f%n" , x);
	System.out.printf("the math.floor is: %.2f%n" , y);
	System.out.printf("the math.abs r is: %.2f%n" , r);
	System.out.printf("the math.ceil is: %.2f%n" , h);
	System.out.printf("the math.abs u is: %.2f%n" , u);
	System.out.printf("the math.ceil s is: %.2f%n" , s);
	System.out.printf("the math.ceil b is: %.2f%n" , b);
	
}
}