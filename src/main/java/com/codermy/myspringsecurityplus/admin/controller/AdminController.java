package com.codermy.myspringsecurityplus.admin.controller;

import com.codermy.myspringsecurityplus.admin.dto.MenuIndexDto;
import com.codermy.myspringsecurityplus.security.dto.JwtUserDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
@Api(tags = "系统：菜单路由")
@Slf4j
@RequiredArgsConstructor
public class AdminController {

    @GetMapping("/index")
    @ApiOperation(value = "通过用户id获取菜单")
    public List<MenuIndexDto> getMenu(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        JwtUserDto user =(JwtUserDto) authentication.getPrincipal();

    }
}
