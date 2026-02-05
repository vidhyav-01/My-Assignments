package week1.day2;
public class IsPrime {

	public static void main(String[] args) {
		// To check whether the assigned number is prime or not
		
		int n=29;
		//int b=27;
		
		boolean prime = true;
		
		if (n<=1) {
			prime =false; //numbers <=1 is not prime
		} else {
//iterate 2 to n-1
		} for (int i = 2; i < n; i++) {
			if (n % i ==0) {
				prime = false;
				break;
			} 

			}
			

	if (prime) { System.out.println(n+ " is a prime number."); } 
	else { System.out.println(n + " is not a prime number.");		
		}
	}

}