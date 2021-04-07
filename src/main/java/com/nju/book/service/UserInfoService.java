package com.nju.book.service;

import com.nju.book.model.UserInfo;
import com.nju.book.vo.ResultVO;

public interface UserInfoService {

    public ResultVO login(UserInfo userInfo);
}
