package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// declare input and output variable
		
		int input = 121; //input a number
		int output = 0; //reversed number
		
		// for loop to reverse the number
        for (int i = input; i > 0; i = i / 10) {
            int rem = i % 10;
            output = output * 10 + rem;
        }
        // compare input and output
        System.out.println("The reversed number is :");
        if (input == output) {
            System.out.println(input + " is a palindrome number.");
        } else {
            System.out.println(input + " is not a palindrome number.");
        }		
		

	}

}
