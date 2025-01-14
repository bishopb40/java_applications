public class TypeCasting{
 public static void main(String [] args){
	 int num1 =100;
	 double d = (double) num1;
	 
	 System.out.println(d);
	 
	 long longValue = 100000000000L;
	 int intValue = (int) longValue;
	 
	 System.out.println(intValue);
	 
	 double num = 100.9;
	 int i  = (int) num;
	 System.out.println(i);
 }
}