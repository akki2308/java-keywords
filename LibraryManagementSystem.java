class LibraryManagementSystem {
    // Static variable shared across all books
    private static String libraryName = "Central Library";
    
    // Final variable to ensure ISBN cannot be changed
    private final String isbn;
    private String title;
    private String author;
    
    // Constructor using 'this' to resolve ambiguity
    public LibraryManagementSystem(String title, String author, String isbn) { // Fixed constructor name
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    
    // Method to display book details
    public void displayBookDetails() {
        if (this instanceof LibraryManagementSystem) { // instanceof check
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object");
        }
    }
    
    public static void main(String[] args) {
        LibraryManagementSystem book1 = new LibraryManagementSystem("The Alchemist", "Paulo Coelho", "978-0061122415");
        LibraryManagementSystem book2 = new LibraryManagementSystem("1984", "George Orwell", "978-0451524935");
        
        // Display library name
        LibraryManagementSystem.displayLibraryName();
        
        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
