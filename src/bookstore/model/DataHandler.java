package bookstore.model;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public enum DataHandler {
    INSTANCE;
    private List<Book> books = null;

    public List<Book> getBooks() {
        if (books == null){
            books = new ArrayList<>();
            books.add(new Book("Space exploration", "Mike", 200.5));
            books.add(new Book("Gardening ", "Andy", 100.2));
            books.add(new Book("Love story", "Amanda", 400.5));
            books.add(new Book("Cats and dogs", "Jay Leno", 40.5));
        }
        return books;
    }

    public void createBook(Book book){
        getBooks().add(book);
    }

    public void deleteBook(Book book){
        getBooks().remove(book);
    }

    public ObservableList<Book> booksAsObservableList(){
        ObservableList<Book> ol = FXCollections.observableList(getBooks());
        return ol;
    }
}
