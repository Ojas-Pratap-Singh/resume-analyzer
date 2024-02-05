package com.example.demo.DTO.RequestDto;

import com.example.demo.Enum.UserRole;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRequestDto {

    String firstName;

    String lastName;

    long mobileNo;

    String emailId;

    UserRole userRole;
}
