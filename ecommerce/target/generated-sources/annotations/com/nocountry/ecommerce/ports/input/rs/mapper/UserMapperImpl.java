package com.nocountry.ecommerce.ports.input.rs.mapper;

import com.nocountry.ecommerce.domain.model.User;
import com.nocountry.ecommerce.ports.input.rs.request.RegisterRequest;
import com.nocountry.ecommerce.ports.input.rs.request.UpdateUserRequest;
import com.nocountry.ecommerce.ports.input.rs.response.UserDetailResponse;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User registerRequestToUser(RegisterRequest registerRequest) {
        if ( registerRequest == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( registerRequest.getEmail() );
        user.setPassword( registerRequest.getPassword() );
        user.setFirstName( registerRequest.getFirstName() );
        user.setLastName( registerRequest.getLastName() );
        user.setPhone( registerRequest.getPhone() );

        return user;
    }

    @Override
    public UserDetailResponse userToCreateUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserDetailResponse userDetailResponse = new UserDetailResponse();

        userDetailResponse.setFirstName( user.getFirstName() );
        userDetailResponse.setLastName( user.getLastName() );
        userDetailResponse.setEmail( user.getEmail() );

        return userDetailResponse;
    }

    @Override
    public UserDetailResponse userToUserDetailResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserDetailResponse userDetailResponse = new UserDetailResponse();

        userDetailResponse.setFirstName( user.getFirstName() );
        userDetailResponse.setLastName( user.getLastName() );
        userDetailResponse.setEmail( user.getEmail() );

        return userDetailResponse;
    }

    @Override
    public User updateUserRequestToUser(UpdateUserRequest updateUserRequest) {
        if ( updateUserRequest == null ) {
            return null;
        }

        User user = new User();

        user.setPassword( updateUserRequest.getPassword() );
        user.setFirstName( updateUserRequest.getFirstName() );
        user.setLastName( updateUserRequest.getLastName() );
        user.setPhone( updateUserRequest.getPhone() );

        return user;
    }
}
