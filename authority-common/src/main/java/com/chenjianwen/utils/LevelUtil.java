package com.chenjianwen.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description: 部门级别工具类
 * @Author chenjianwen
 * @Date 2019-08-24
 **/
public class LevelUtil {

    public final static String SEPARATOR = ".";
    public final static String ROOT = "0";

    //0
    //0.1
    //0.1.2
    //0.1.3
    //0.2
    public static String calculateLevel(String parentLevel, int parentId) {
        if(StringUtils.isBlank(parentLevel)){
            return ROOT;
        }else{
            return StringUtils.join(parentLevel,SEPARATOR,parentId);
        }
    }
}
