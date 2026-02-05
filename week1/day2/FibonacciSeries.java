package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones.
		//Next number = sum of previous two numbers
		
		int n =8;
		int n1=0; int n2 =1;
		
		System.out.println("Fibonacci Series for " +n+" terms are :" );
		
		for (int i = 0; i <n; i++) {
			System.out.println(n1 + "");
			int n3 = n1 + n2;
			n1=n2;
			n2= n3;
			
			
		}
	}

}
