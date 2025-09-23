package com.codermy.myspringsecurityplus.admin.controller;

import com.wf.captcha.utils.CaptchaUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Api(tags = "系统：验证码")
@RequestMapping("/captcha")
public class CaptchaController {
    @ApiOperation(value = "验证码")
    @SneakyThrows
    @GetMapping
    public void captcha(HttpServletRequest request, HttpServletResponse response){
        CaptchaUtil.out(120,45,4,request,response);
    }
}
