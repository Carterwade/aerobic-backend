package edu.nju.aerobic.service;

import edu.nju.aerobic.model.UserInfo;
import edu.nju.aerobic.vo.ResultVO;

public interface UserInfoService {

    ResultVO login(UserInfo userInfo);
}
