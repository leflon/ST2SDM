public class BorrowingManager {
	private List<Borrowing> borrowings = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

	public void reserveBook(Subscriber s, Book b) {
		// Logic to reserve
	}

	public void borrowBook(Subscriber s, Book b) {
		// Logic to borrow a book
	}

	public void returnBook(Borrowing b) {
		// Logic to return a book
	}
}
