public class Book {
    private String title;
    private String author;
    private String isbn;
    public static int totalBooks = 0;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        totalBooks++;
    }

    public static void displayTotalBooks() {
        System.out.println("Total books: " + totalBooks);
    }

    public static void main(String[] args) {
        // Membuat beberapa objek Book
        Book book1 = new Book("Laskar Pelangi", "Andrea Hirata", "9789791227608");
        Book book2 = new Book("Bumi Manusia", "Pramoedya Ananta Toer", "9789799731282");
        Book book3 = new Book("Supernova", "Dee Lestari", "9789792286772");

        Book.displayTotalBooks(); 
    }
}
