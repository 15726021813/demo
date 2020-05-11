package com.example.demo.controller;

import com.example.demo.domain.Userinfo;
import com.example.demo.service.UserinfoService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @author 徐长乐
 * @date 2020/5/11
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserinfoService userinfoService;

    @GetMapping("findAll")
    public List<Userinfo> findAll(){
    return     userinfoService.loadAll();
    }

    @GetMapping("getById")
    public Userinfo getById(Integer id){
        return  userinfoService.getById(id);
    }


}
