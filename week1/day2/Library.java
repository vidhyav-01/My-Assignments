package week1.day2;

public class Library {

	// Method with one input argument and return value		
		String addBook(String bookTitle) {
		return bookTitle;
		}
		
		// Method without arguments and return type
		void issueBook() {
			System.out.println("Book issued successfully"); 
		}
		

		public static void main(String[] args) {
			
		    // Create object of Library class
			Library lib = new Library();
		   // Call addBook method
	       String bookTitle = lib.addBook("Java Programming");
	       //call issue book method
	        lib.issueBook();
			
			
	}

}

