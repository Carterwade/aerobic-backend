package com.nju.book.service.impl;

import com.nju.book.mapper.UserInfoMapper;
import com.nju.book.model.UserInfo;
import com.nju.book.service.UserInfoService;
import com.nju.book.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 登录
     * @param userInfo
     * @return 0:登录成功 1:用户名不对 2:密码不对
     */
    @Override
    public ResultVO login(UserInfo userInfo) {
        Integer flag = 0;
        UserInfo qUserInfo = userInfoMapper.selectByUsername(userInfo.getUserName());
        if(qUserInfo == null){ //没有用户
            flag = 1;
        }else{
            if(!qUserInfo.getPassword().equals(userInfo.getPassword())){ //密码不对
                flag = 2;
            }
        }
        ResultVO resultVO = new ResultVO(flag,qUserInfo);
        return resultVO;
    }
}
