package edu.nju.aerobic.controller;

import edu.nju.aerobic.model.UserInfo;
import edu.nju.aerobic.service.UserInfoService;
import edu.nju.aerobic.vo.ResultVO;
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
