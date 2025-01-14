public class MathMethod{
	public static void main(String[] args){
		double x = 6.7;
		double y = 5.8;
		
		double sqrtX = Math.sqrt(x);
		
		System.out.println("The Square root of x :" + sqrtX);
		
		
		double powerXY = Math.pow(x,y);
		
		System.out.println("The power of x and y is :" + powerXY);
		
		int roundedX = (int)Math.round(x);
		
		System.out.println("the rounded x is: " + roundedX);
		
		double randomNum = Math.random();
		
		System.out.println("the random num of x and y is : " + randomNum);
	}
}