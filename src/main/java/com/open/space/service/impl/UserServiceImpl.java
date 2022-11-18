package com.open.space.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.open.space.domain.entity.User;
import com.open.space.mapper.UserMapper;
import com.open.space.service.UserService;
import org.springframework.stereotype.Service;

/**
* @author WHQ
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-11-18 14:02:47
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




