package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		//declare the input arrays
		int [] array = {1, 4, 3, 2, 8, 6, 7};
		//Step1 : Sort the array
		Arrays.sort(array);
		//step 2: for loop to iterate and compare
		for (int i = 0; i < array.length; i++) {
		// Expected number should be i+1
			
		if (array[i] != i+1) {
			System.out.println("Missing number is " +(i+1));
			break;
		}
			
		}

	}

}
//execution flow

//Index 0 1 2 3 4 5 6 
//Value 1 2 3 4 6 7 8
//Example
//Iteration 1
//Expected number should be 1
// array[0]=1
//1==1

//Iteration 4
//Expected number =5
//array[4]=6
//5=6---->which is missing element