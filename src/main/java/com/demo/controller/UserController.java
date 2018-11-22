package com.demo.controller;

import com.demo.Service.UserService;
import com.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/showUser",method = RequestMethod.GET)
    public Person selectUser (@RequestParam(value = "id", required = false, defaultValue = "1") int id){
        return userService.selectUser(id);
    }
    @RequestMapping(value="/showName",method = RequestMethod.GET)
    public Person selectName (@RequestParam String name){
        return userService.selectName(name);
    }
}
