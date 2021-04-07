package com.nju.book.controller;

import com.nju.book.model.UserInfo;
import com.nju.book.service.UserInfoService;
import com.nju.book.vo.ResultVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/user")
@RestController
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("login")
    public ResultVO login(@RequestBody UserInfo userInfo){
        return userInfoService.login(userInfo);
    }
}
