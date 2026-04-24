public class PhysicalBookBorrowingPolicy extends BorrowingPolicy {
	@Override
	public boolean canBorrow(Subscriber subscriber, Book book) {
		PhysicalBook physicalBook = (PhysicalBook) book;
		return physicalBook.availableCopies() > 0;
	}

	@Override
	public boolean borrowBook(Subscriber subscriber, Book book) {
		if (!canBorrow(subscriber, book)) {
			return false;
		}
		PhysicalBook physicalBook = (PhysicalBook) book;
		physicalBook.setAvailableCopies(physicalBook.availableCopies() - 1);
		return true;
	}

	@Override
	public void returnBook(Subscriber subscriber, Book book) {
		PhysicalBook physicalBook = (PhysicalBook) book;
		physicalBook.setAvailableCopies(physicalBook.availableCopies() + 1);
	}
	
}
