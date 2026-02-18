package week3.day1;

public class OddindexToUppercase {

	public static void main(String[] args) {
		//Declare the variable
		String test ="changeme";//output cHaNgEmE
		//index 1->H
        //index 3->N
        //index 5->E
        //index 7->E
		
		//convert string to character array
		
		char[] index = test.toCharArray();
        //Loop from start letter to end letter
		for (int i = index.length-1;i>=0; i--) {
			//check if index is odd
			if (i%2!=0) {
				index[i] = Character.toUpperCase(index[i]);
			}
		}
		// Print the final result
        System.out.println("output is " + new String(index));
//execution flow
//  iteration flow i=7
//        7%2!=0-->odd index
//        convert index[7] ->'e'->'E'-->Which is expected
//       i =6
//        6%2=0--->even index
//        convert index[6]-->'m'-->'m'--->no change in output as its even

	}

}
