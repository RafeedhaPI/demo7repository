package com.example.demo7.Controller;



import com.example.demo7.Service.UserService;
import com.example.demo7.UserRequest.RequestDTO;
import com.example.demo7.UserResponse.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/checkDuplicate")
    public ResponseDTO checkDuplicateUser(@RequestBody RequestDTO requestDTO) {
        return userService.checkDuplicateUser(requestDTO);
    }
}
