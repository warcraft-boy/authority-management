package com.chenjianwen.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Slf4j
public class HttpInterceptor extends HandlerInterceptorAdapter {

    private static final String START_TIME = "timestamp";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI().toString();
        Map paramMap = request.getParameterMap();
        Long start = System.currentTimeMillis();
        request.setAttribute(START_TIME,start);
        log.info("request start. url:{}, params:{}",url,JsonUtils.obj2String(paramMap));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        String url = request.getRequestURI().toString();
        Map paramMap = request.getParameterMap();
        Long start = (Long) request.getAttribute(START_TIME);
        Long end = System.currentTimeMillis();
        log.info("request finish. url:{}, params:{}, cost:{}",url,JsonUtils.obj2String(paramMap),end - start);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        String url = request.getRequestURI().toString();
        Map paramMap = request.getParameterMap();
        Long start = (Long) request.getAttribute(START_TIME);
        Long end = System.currentTimeMillis();
        log.info("request completion. url:{}, params:{}, cost:{}",url,JsonUtils.obj2String(paramMap),end - start);
    }
}
