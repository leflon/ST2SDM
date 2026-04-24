public interface IBorrowingManager {
	void borrowBook(Subscriber subscriber, Book book);
	void returnBook(Borrowing borrowing);
}
