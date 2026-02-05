package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Library libra = new Library();
     
     String bookTitle = libra.addBook("Human Pshycology Books");
     libra.addBook(bookTitle);
     libra.issueBook();
     System.out.println(bookTitle);
      
	}

}
