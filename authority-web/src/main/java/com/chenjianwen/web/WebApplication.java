package com.chenjianwen.web;

import com.chenjianwen.JsonData;
import com.chenjianwen.exceptions.PermissionException;
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
    public JsonData index(){
        log.info("hello");
        throw new RuntimeException("test exception");
        //return JsonData.success("hello world");
    }
}
