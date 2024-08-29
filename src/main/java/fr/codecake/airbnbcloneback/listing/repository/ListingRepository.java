package fr.codecake.airbnbcloneback.listing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.codecake.airbnbcloneback.listing.domain.Listing;

public interface ListingRepository extends JpaRepository<Listing, Long> {

}
