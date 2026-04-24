public interface IBookRepository {
	void addBook(Book book);
	void removeBook(String bookID);
	Book findBookByID(String bookID);
	List<Book> findBooksByTitle(String title);
	List<Book> findBooksByAuthor(String author);
}
