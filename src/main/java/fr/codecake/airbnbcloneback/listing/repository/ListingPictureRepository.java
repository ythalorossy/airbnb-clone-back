package fr.codecake.airbnbcloneback.listing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.codecake.airbnbcloneback.listing.domain.ListingPicture;

public interface ListingPictureRepository extends JpaRepository<ListingPicture, Long> {

}
