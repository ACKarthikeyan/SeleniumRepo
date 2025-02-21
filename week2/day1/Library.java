package week2.day1;

public class Library {
	    public String addBook(String bookTitle) {
	        System.out.println("Book added successfully");
	        return bookTitle;
	    }
	    
	    public void issueBook() {
	        System.out.println("Book issued successfully");
	    }
	    
	    public static void main(String[] args) {
	        Library library = new Library();
	        library.addBook("Java Programming");
	        library.issueBook();
	    }
	}

	class LibraryManagement {
	    public static void main(String[] args) {
	        Library library = new Library();
	        library.addBook("Data Structures");
	        library.issueBook();
	    }

}
