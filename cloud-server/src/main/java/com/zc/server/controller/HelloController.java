package com.zc.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello 测试控制类
 *
 * @Author MoYu
 * @Date 2021/4/16 15:42
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping ("/employee/basic/hello")
    public String hello2() {
        return "/employee/basic/hello";
    }
    @GetMapping("/employee/advanced/hello")
    public String hello3(){
        return "/employee/advanced/hello";}
}

