package fr.codecake.airbnbcloneback.user.mapper;

import org.mapstruct.Mapper;

import fr.codecake.airbnbcloneback.user.application.dto.ReadUserDTO;
import fr.codecake.airbnbcloneback.user.domain.Authority;
import fr.codecake.airbnbcloneback.user.domain.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    ReadUserDTO readUserDTOTUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }
}
