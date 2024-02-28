package com.example.demo7.Service;


import com.example.demo7.Repository.UserRepository;
import com.example.demo7.UserRequest.RequestDTO;
import com.example.demo7.UserResponse.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseDTO checkDuplicateUser(RequestDTO requestDTO) {
        String phoneNumber = requestDTO.getPhoneNumber();
        ResponseDTO responseDTO = null;
        if (userRepository.existsByPhoneNumber(phoneNumber)) {
            responseDTO = new ResponseDTO("User with phone number already exists", HttpStatus.CONFLICT.value());
        }
        else
        responseDTO = new  ResponseDTO("User does not exist", HttpStatus.OK.value());
        return responseDTO;
    }
}
