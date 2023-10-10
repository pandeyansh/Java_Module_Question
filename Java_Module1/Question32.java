import java.util.ArrayList;
import java.util.List;
class Book {
    private int id;
    private String title;
    private String author;
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Book [ID=" + id + ", Title=" + title + ", Author=" + author + "]";
    }
}
class Library {
    private List<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                books.remove(book);
                break;
            }
        }
    }
    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
public class Question32 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.displayBooks();
        library.removeBook(2);
        library.displayBooks();
    }
}