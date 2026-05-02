package ApriBatch_day8;
import java.util.*;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return title.equals(b.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}

public class libraryManagement {
    public static void main(String[] args) {
        Map<Book, Boolean> library = new HashMap<>();

        Book b1 = new Book("Java Basics");
        Book b2 = new Book("Data Structures");

        library.put(b1, true);   
        library.put(b2, false);  

        for (Map.Entry<Book, Boolean> entry : library.entrySet()) {
            System.out.println(entry.getKey().title + " available: " + entry.getValue());
        }
    }
}
