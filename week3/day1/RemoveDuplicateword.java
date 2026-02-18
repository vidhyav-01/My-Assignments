package week3.day1;

public class RemoveDuplicateword {

	public static void main(String[] args) {
		//Declare a variable text with the phrase
		String text = "We learn Java basics as part of java sessions in java week1";
		//count records the no.of duplicates in phrase
		int count = 0;
		//Split string into words
		String[] words = text.split(" ");
		//Nested for loop to compare each word with other word
		
		for (int i = 0; i < words.length; i++) {
			//j = i + 1-> to compare each word with the words that come after it
			for (int j = i+1; j < words.length; j++) {
				//case sensitive comparison
				//equalsIgnoreCase() to treat java and Java as duplicate
				if (words[i].equalsIgnoreCase(words[j])) {
				   words[j] = "";
					count++;         // Increment duplicate count
     				}
					}
		}
	      //Print the duplicates found
			if (count>0) {
				System.out.println("After removing duplicate words:");
                 for (int i = 0; i < words.length; i++) {
            	 System.out.print(words[i] + " ");
     }
	}
	}
}
	           
	
	
	
	            
		 
			
		

	


