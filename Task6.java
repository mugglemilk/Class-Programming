
import java.util.ArrayList;

public class Book {

    String isbn;
    String title;
    String type;
    double price;

    public Book(String isbn, String title, String type, double price) {

        this.isbn = isbn;
        this.title = title;
        this.type = type;
        this.price = price;
    }
}

class BookStore {

    ArrayList<Book> books = new ArrayList<>();
}
