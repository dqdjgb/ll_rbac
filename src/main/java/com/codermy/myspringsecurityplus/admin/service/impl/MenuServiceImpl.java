package com.codermy.myspringsecurityplus.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codermy.myspringsecurityplus.admin.entity.MyMenu;
import com.codermy.myspringsecurityplus.admin.mapper.MenuMapper;
import com.codermy.myspringsecurityplus.admin.service.MenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MyMenu> implements MenuService {

}
