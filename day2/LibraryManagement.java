package week2.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		
		 Library library = new Library();
		 String addedBook = library.addBook("The Power of Your Subconscious Mind");
	     System.out.println("Returned Book Title: " +addedBook);
         library.issueBook();


	}

}

