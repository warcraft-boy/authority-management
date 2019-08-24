package com.chenjianwen.web;

import com.chenjianwen.JsonData;
import com.chenjianwen.api.authority.SysAclModule;
import com.chenjianwen.dal.authority.SysAclModuleMapper;
import com.chenjianwen.exceptions.PermissionException;
import com.chenjianwen.utils.ApplicationContextHelper;
import com.chenjianwen.utils.BeanValidator;
import com.chenjianwen.utils.JsonUtils;
import com.chenjianwen.web.test.TestVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

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

    @RequestMapping("/validate.json")
    @ResponseBody
    public JsonData validate(TestVo vo){
        log.info("validate");
        SysAclModuleMapper sysAclModuleMapper = ApplicationContextHelper.popBean(SysAclModuleMapper.class);
        SysAclModule sysAclModule = sysAclModuleMapper.selectByPrimaryKey(1L);
        log.info(JsonUtils.obj2String(sysAclModule));
        BeanValidator.check(vo);
//        try {
//            Map<String,String> map = BeanValidator.validateObject(vo);
//            if(MapUtils.isNotEmpty(map)){   //map != null && map.entrySet().size() > 0
//                for(Map.Entry<String,String> entry : map.entrySet()){
//                    log.info("{0}->{1}",entry.getKey(),entry.getValue());
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return JsonData.success("hello world");
    }
}
