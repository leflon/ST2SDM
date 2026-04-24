public interface IBorrowingManager {
	void borrowBook(Subscriber subscriber, Book book);
	void returnBook(Borrowing borrowing);
	void reserveBook(Subscriber subscriber, Book book);
}
