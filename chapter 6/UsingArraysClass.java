import java.util.Arrays;

public  class UsingArraysClass{
	public static void main(String args[]){
		int[] numbers ={6,19,2,29,1,30,8,3,12,4};
		int [] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		boolean isEqual = Arrays.equals(arr1,arr2);
		
		System.out.printf("%b%n",isEqual);
		Arrays.sort(numbers);
		int index= Arrays.binarySearch(numbers,30);
		
		System.out.printf("the index number is %d%n",index);
		
		System.out.println("");
		
		//filling arrays
		
		int[] myArrays = new int[5];
		
		Arrays.fill(myArrays,20);
		
		// copy
		int[] original={1,2,3};
		int[] copy = Arrays.copyOf(original,5);
		
		//converting arrays to strinmg
		String copyArray = Arrays.toString(copy);
		
		System.out.printf("%s%n",copyArray);
		
		
		
		for (int i : numbers){
			System.out.printf("%d%n",i);
		}
		System.out.println("");
		
		for (int u : myArrays){
			System.out.printf("%d%n",u);
		}
		System.out.println("");
		
		for (int h : copy){
			System.out.printf("%d%n",h);
		}
	}
	
}