public class ElementArray{
	public static void main(String args[]){
// a) Set the 10 elements of integer array counts to zero.
		int[] counts = new int[10]; // Declare and initialize an array with 10 elements
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0; // Set each element to zero
		}

// b) Add one to each of the 15 elements of integer array bonus.
		int[] bonus = new int[15]; // Declare and initialize an array with 15 elements
		for (int i = 0; i < bonus.length; i++) {
			bonus[i] += 1; // Add one to each element
		}

// c) Display the five values of integer array bestScores in column format.
		int[] bestScores = {95, 87, 92, 78, 88}; // Example array with 5 elements
		for (int i = 0; i < bestScores.length; i++) {
			System.out.println(bestScores[i]); // Print each element on a new line
		}
	}
}
