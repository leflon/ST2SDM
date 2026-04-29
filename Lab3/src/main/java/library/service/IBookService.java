package library.service;

import library.model.Book;
import java.util.List;

public interface IBookService {
    void addBook(Book book);
    void removeBook(Book book);
    List<Book> searchBooks(String keyword);
    Book getBookById(String id);
}
