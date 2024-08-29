package fr.codecake.airbnbcloneback.booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.codecake.airbnbcloneback.booking.domain.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
