package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
//		1.Write input and output
//		2.Pseudocode
//		3.Java syntax

		String companyName="TestLeaf";
		char[] charArray = companyName.toCharArray();
		
		for (int i =companyName.length()-1; i>=0;i--) 
		{
		System.out.println(companyName.charAt(i));
	}
		
	}
}

