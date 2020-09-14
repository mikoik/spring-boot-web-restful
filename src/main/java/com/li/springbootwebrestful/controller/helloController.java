package com.li.springbootwebrestful.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:    helloController
 * Package:    com.li.springbootwebrestful.controller
 * Description:
 * Datetime:    2020/09/14   9:52
 * Author:   mokili
 */
@Controller
public class helloController {
    @ResponseBody
    @RequestMapping("/helle")
    public String hello(){
        return "hello world";
    }
}
