package com.example.demo.Transformer;

import com.example.demo.DTO.RequestDto.UserRequestDto;
import com.example.demo.DTO.ResponseDto.UserResponseDto;
import com.example.demo.Model.User;

public class UserTransformer {

    public static User DtoToUser(UserRequestDto userRequestDto){
        return User.builder()
                .firstName(userRequestDto.getFirstName())
                .lastName(userRequestDto.getLastName())
                .emailId(userRequestDto.getEmailId())
                .mobileNo(userRequestDto.getMobileNo())
                .userRole(userRequestDto.getUserRole())
                .build();
    }

    public static UserResponseDto UserToDto(User user){
        return UserResponseDto.builder()
                .FirstName(user.getFirstName())
                .LastName(user.getLastName())
                .EmailId(user.getEmailId())
                .MobileNo(user.getMobileNo())
                .userRole(user.getUserRole())
                .build();
    }
}
