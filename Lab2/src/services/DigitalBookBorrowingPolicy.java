public class DigitalBookBorrowingPolicy extends BorrowingPolicy{
	@Override
	public boolean canBorrow(Subscriber subscriber, Book book) {
		DigitalBook digitalBook = (DigitalBook) book;
		return digitalBook.availableLicenses() > 0;
	}

	@Override
	public boolean borrowBook(Subscriber subscriber, Book book) {
		if (!canBorrow(subscriber, book)) {
			return false;
		}
		DigitalBook digitalBook = (DigitalBook) book;
		digitalBook.setAvailableLicenses(digitalBook.availableLicenses() - 1);
		return true;
	}

	@Override
	public void returnBook(Subscriber subscriber, Book book) {
		DigitalBook digitalBook = (DigitalBook) book;
		digitalBook.setAvailableLicenses(digitalBook.availableLicenses() + 1);
	}	
}
