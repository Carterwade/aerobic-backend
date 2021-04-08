package edu.nju.aerobic.service.impl;

import edu.nju.aerobic.mapper.UserInfoMapper;
import edu.nju.aerobic.model.UserInfo;
import edu.nju.aerobic.service.UserInfoService;
import edu.nju.aerobic.vo.ResultVO;
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
