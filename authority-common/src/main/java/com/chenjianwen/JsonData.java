package com.chenjianwen;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 返回响应数据
 * @Date: Created in 2019/8/22 <br>
 * @Author: chenjianwen
 */
@Setter
@Getter
public class JsonData<T> {

    /***
     * 是否返回成功
     */
    private Boolean success;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private T data;


    public JsonData(Boolean success) {
        this.success = success;
    }

    public static <T> JsonData<T> success(T t, String msg) {
        JsonData jsonData = new JsonData(true);
        jsonData.data = t;
        jsonData.msg = msg;
        return jsonData;
    }

    public static <T> JsonData<T> success(T t) {
        JsonData jsonData = new JsonData(true);
        jsonData.data = t;
        return jsonData;
    }

    public static <T> JsonData<T> success(String msg) {
        JsonData jsonData = new JsonData(true);
        jsonData.msg = msg;
        return jsonData;
    }

    public static <T> JsonData<T> success() {
        JsonData jsonData = new JsonData(true);
        return jsonData;
    }

    public static <T> JsonData<T> fail(T t, String msg) {
        JsonData jsonData = new JsonData(false);
        jsonData.data = t;
        jsonData.msg = msg;
        return jsonData;
    }

    public static <T> JsonData<T> fail(String msg) {
        JsonData jsonData = new JsonData(false);
        jsonData.msg = msg;
        return jsonData;
    }

    public Map<String,Object> toMap(){
        HashMap<String,Object> result = new HashMap<String,Object>();
        result.put("success",this.success);
        result.put("msg",this.msg);
        result.put("data",data);
        return result;
    }
}
