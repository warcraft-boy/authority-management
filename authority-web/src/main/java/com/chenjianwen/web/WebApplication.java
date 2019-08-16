package com.chenjianwen.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: <br>
 * @Date: Created in 2019/8/16 <br>
 * @Author: chenjianwen
 */
@Controller
@Slf4j
public class WebApplication {

    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        log.info("hello");
        return "hello world";
    }
}
