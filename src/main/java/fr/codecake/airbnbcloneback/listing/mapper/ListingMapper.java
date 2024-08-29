package fr.codecake.airbnbcloneback.listing.mapper;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = { ListingPictureMapper.class })
public interface ListingMapper {

}
