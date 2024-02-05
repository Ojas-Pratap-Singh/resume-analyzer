package com.example.demo.DTO.ResponseDto;

import com.example.demo.Enum.UserRole;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDto {

    String FirstName;

    String LastName;

    String EmailId;

    long MobileNo;

    UserRole userRole;
}
