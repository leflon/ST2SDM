public interface IReservationRepository {
    void save(Reservation reservation);
    void delete(Reservation reservation);
    Reservation findById(String id);
}