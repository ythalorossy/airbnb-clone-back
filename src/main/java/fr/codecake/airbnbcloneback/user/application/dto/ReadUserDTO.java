package fr.codecake.airbnbcloneback.user.application.dto;

import java.util.Set;

public record ReadUserDTO(
        String firstName,
        String lastName,
        String email,
        String imageUrl,
        Set<String> authorities) {

}
