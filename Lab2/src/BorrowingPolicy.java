public abstract class BorrowingPolicy {
	public abstract boolean canBorrow(Subscriber subscriber, Book book);
	public abstract boolean borrowBook(Subscriber subscriber, Book book);
	public abstract void returnBook(Subscriber subscriber, Book book);
}
