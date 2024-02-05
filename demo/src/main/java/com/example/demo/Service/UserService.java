package com.example.demo.Service;


import com.example.demo.DTO.RequestDto.UserRequestDto;
import com.example.demo.DTO.ResponseDto.UserResponseDto;

public interface UserService {

    UserResponseDto AddUser(UserRequestDto userRequestDto);
}
