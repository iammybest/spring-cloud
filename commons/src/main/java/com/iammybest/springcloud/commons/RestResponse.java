package com.iammybest.springcloud.commons;

import java.io.Serializable;
import java.util.List;

/**
 * @author 邓清海
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: Restful接口请求返回封装类
 * TODO 可在封装分页
 * @date 2017/11/17
 * @Time 18:12
 */
public class RestResponse<T> implements Serializable {
    public Integer code;
    public String msg;
    public T data;
    public List<T> list;

    public Integer getCode() {
        return code;
    }

    public RestResponse setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public RestResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public RestResponse setData(T data) {
        this.data = data;
        return this;
    }

    public List<T> getList() {
        return list;
    }

    public RestResponse setList(List<T> list) {
        this.list = list;
        return this;
    }
}
