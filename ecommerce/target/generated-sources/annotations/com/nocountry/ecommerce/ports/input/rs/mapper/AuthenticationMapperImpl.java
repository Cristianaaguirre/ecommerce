package com.nocountry.ecommerce.ports.input.rs.mapper;

import com.nocountry.ecommerce.common.security.utils.Jwt;
import com.nocountry.ecommerce.ports.input.rs.response.AuthResponse;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14 (Oracle Corporation)"
)
@Component
public class AuthenticationMapperImpl implements AuthenticationMapper {

    @Override
    public AuthResponse jwtToAuthResponse(Jwt jwt) {
        if ( jwt == null ) {
            return null;
        }

        AuthResponse authResponse = new AuthResponse();

        authResponse.setJwt( jwt.getJwt() );
        authResponse.setJwtRefresh( jwt.getJwtRefresh() );

        return authResponse;
    }
}
