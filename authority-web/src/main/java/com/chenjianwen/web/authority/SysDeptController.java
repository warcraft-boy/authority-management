package com.chenjianwen.web.authority;

import com.chenjianwen.JsonData;
import com.chenjianwen.api.authority.param.DeptParam;
import com.chenjianwen.service.authority.SysDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 部门controller
 * @Author chenjianwen
 * @Date 2019-08-24
 **/
@Controller
@RequestMapping("/sys/dept")
@Slf4j
public class SysDeptController {

    @Autowired
    private SysDeptService sysDeptService;

    @RequestMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(DeptParam param){
        sysDeptService.save(param);
        return JsonData.success();
    }
}
