package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/index")
public class Hello {
    @RequestMapping("/aa")
    public String index(){
        System.out.println("进入首页");
        return "hello.html";
    }

    @RequestMapping("/bb")
    @ResponseBody
    public String get(){
        System.out.println("bbbbb");
        return "bbbbbbbbbbb";
    }
}
