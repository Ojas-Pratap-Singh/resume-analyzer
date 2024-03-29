package com.example.demo.Controller;

import com.example.demo.DTO.RequestDto.UserRequestDto;
import com.example.demo.DTO.ResponseDto.UserResponseDto;
import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;

    @PostMapping("/add")
    public ResponseEntity AddUser(@RequestBody UserRequestDto userRequestDto){
        User user = userRepository.findByEmailId(userRequestDto.getEmailId());
        User user1 = userRepository.findByMobileNo(userRequestDto.getMobileNo());
        if(user == null && user1 == null ){
            UserResponseDto userResponseDto = userService.AddUser(userRequestDto);
            return new ResponseEntity<>(userResponseDto, HttpStatus.ACCEPTED);
        }
        if(user != null){
            return new ResponseEntity<>("Email Id Already Exist", HttpStatus.NOT_ACCEPTABLE);
        }
        return new ResponseEntity<>("MobileNo Already Exist", HttpStatus.NOT_ACCEPTABLE);
    }

    @DeleteMapping("/delete")
    public ResponseEntity DeleteUser(@RequestParam long mobileNo){
        User user = userRepository.findByMobileNo(mobileNo);
        if(user != null ){
            userRepository.delete(user);
            return new ResponseEntity<>("User Delete Successfully ", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
    }
}
