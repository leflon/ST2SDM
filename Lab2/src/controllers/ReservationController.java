public class ReservationController {

    private IReservationRepository reservationRepository;

    public ReservationController(IReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public Reservation reserve(Subscriber subscriber, Book book) {
        Reservation reservation = new Reservation(subscriber, book);
        if (this.reservationRepository != null) {
            this.reservationRepository.save(reservation);
        }
        return reservation;
    }

    public void cancelReservation(Reservation reservation) {
        if (reservation != null) {
            if (this.reservationRepository != null) {
                this.reservationRepository.delete(reservation);
            }
        }
    }
}