package com.crijan.account_service.mapper;

import com.crijan.account_service.dto.auth.SignupRequest;
import com.crijan.account_service.dto.auth.UserProfileResponse;
import com.crijan.account_service.entity.User;
import com.crijan.common_library.dto.UserDto;
import com.crijan.common_library.security.JwtUserPrincipal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel  = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    @Mapping(source = "userId", target = "id")
    UserProfileResponse toUserProfileResponse(JwtUserPrincipal user);

    UserDto toUserDto(User user);
}
