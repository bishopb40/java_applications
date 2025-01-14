public class StackExample{
	public static void main(String[] args){
		methodA();
	}
	public static void methodA(){
		int x = 10;
		methodB();
	}
	public static void methodB(){
		int y = 20;
	}
}