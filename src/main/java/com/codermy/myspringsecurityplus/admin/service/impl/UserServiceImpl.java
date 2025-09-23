package com.codermy.myspringsecurityplus.admin.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codermy.myspringsecurityplus.admin.entity.MyUser;
import com.codermy.myspringsecurityplus.admin.mapper.UserMapper;
import com.codermy.myspringsecurityplus.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author codermy
 * @createTime 2020/7/10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, MyUser> implements UserService {

}
