package com.example.demo.Service.Impl;

import com.example.demo.DTO.RequestDto.UserRequestDto;
import com.example.demo.DTO.ResponseDto.UserResponseDto;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import com.example.demo.Transformer.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserResponseDto AddUser(UserRequestDto userRequestDto) {
        User user = UserTransformer.DtoToUser(userRequestDto);
        userRepository.save(user);
        UserResponseDto userResponseDto = UserTransformer.UserToDto(user);
        return userResponseDto;
    }
}
