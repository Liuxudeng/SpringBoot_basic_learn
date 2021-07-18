package club.xianfu.controller;


import club.xianfu.model.entity.User;
import club.xianfu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/list")
    public List<User> findAll(){
        return userService.findAll();

    }


}
