package com.skcl.controller;

import com.skcl.entity.User;
import com.skcl.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UserController {

    @Autowired
    UserServiceImpl UserServiceImpl;

    @RequestMapping("/hello")
    public String hello(){
        return "胡森校无敌";
    }

    @RequestMapping("/addUser")
    public String addUser(User User){
        String string;
        int add = UserServiceImpl.add(User);
        if(add!=0){
            string = "TR";
        }else {
            string = "FA";
        }
        return string;
    }
}
