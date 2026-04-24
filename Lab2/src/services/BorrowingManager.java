public class BorrowingManager implements IBorrowingManager {
	private List<Borrowing> borrowings = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

	public void reserveBook(Subscriber s, Book b) {
		// Logic to reserve
	}

	public void borrowBook(Subscriber s, Book b) {
        BorrowingPolicy policy = b.borrowingPolicy();
        if (!policy.canBorrow(s, b))
            return; // Or throw an exception
        if (policy.borrowBook(s, b)) {
            Borrowing borrowing = new Borrowing(s, b, LocalDate.now(), LocalDate.now
                    .plusDays(14)); // Example due date
            borrowings.add(borrowing);
        } else {
            // Handle case where borrowing fails
        }
	}

	public void returnBook(Borrowing b) {
        Book book = b.book();
        book.borrowingPolicy().returnBook(b.subscriber(), book);
        borrowings.remove(b);
	}
}
