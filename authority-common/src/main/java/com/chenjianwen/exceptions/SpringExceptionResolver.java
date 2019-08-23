package com.chenjianwen.exceptions;

import com.chenjianwen.JsonData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @Description: 全局异常处理类
 * @Date: Created in 2019/8/22 <br>
 * @Author: chenjianwen
 */
@Slf4j
public class SpringExceptionResolver implements HandlerExceptionResolver{

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex) {
        String url = request.getRequestURL().toString();
        ModelAndView mv;
        String defaultMsg = "system error";
        //'.json', '.page'
        if(url.endsWith(".json")){  //要求项目中所有请求json数据，都是用".json"结尾
            if(ex instanceof PermissionException){
                JsonData result = JsonData.fail(ex.getMessage());
                mv = new ModelAndView("jsonView",result.toMap());
            }else{
                log.error("unknow json exception, url:"+url,ex);
                JsonData result = JsonData.fail(defaultMsg);
                mv = new ModelAndView("jsonView",result.toMap());
            }
        }else if(url.endsWith(".page")){    //要求项目中所有请求page页面，都是用".page"结尾
            JsonData result = JsonData.fail(defaultMsg);
            mv = new ModelAndView("exception",result.toMap());
        }else{
            log.error("unknow page exception, url:"+url,ex);
            JsonData result = JsonData.fail(defaultMsg);
            mv = new ModelAndView("jsonView",result.toMap());
        }
        return mv;
    }
}
