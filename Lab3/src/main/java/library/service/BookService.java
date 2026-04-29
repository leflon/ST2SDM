package library.service;

import library.model.Book;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookService implements IBookService {
    private Map<String, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        if (book == null || book.getId() == null) {
            throw new IllegalArgumentException("Book or book ID must not be null");
        }
        books.put(book.getId(), book);
    }

    @Override
    public void removeBook(Book book) {
        if (book == null || book.getId() == null) {
            throw new IllegalArgumentException("Book or book ID must not be null");
        }
        books.remove(book.getId());
    }

    @Override
    public List<Book> searchBooks(String keyword) {
        if (keyword == null || keyword.isBlank()) {
            return List.copyOf(books.values());
        }
        String lower = keyword.toLowerCase();
        return books.values().stream()
                .filter(b -> b.getTitle().toLowerCase().contains(lower)
                        || b.getAuthor().toLowerCase().contains(lower)
                        || b.getCategory().toLowerCase().contains(lower)
                        || b.getIsbn().toLowerCase().contains(lower))
                .collect(Collectors.toList());
    }

    @Override
    public Book getBookById(String id) {
        return books.get(id);
    }
}
