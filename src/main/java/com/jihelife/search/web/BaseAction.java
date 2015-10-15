/*
 * Copyright (c) 2015. qiatuhangzhou
 */

package com.jihelife.search.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * search-service
 * Action基础类
 * Created by CHECHI on 2015/7/31.
 */
@Controller
public abstract class BaseAction {

    /**
     * The Request.spring封装过的请求对象.
     */
    @Autowired
    protected HttpServletRequest request;

    /**
     * The Result.调用接口统一返回的信息map.
     */
    protected Map<String, Object> result;

    /**
     * Gets request.
     *
     * @return the request.spring封装过的请求对象.
     */
    public HttpServletRequest getRequest() {
        return request;
    }

    /**
     * Sets request.
     *
     * @param request the request.spring封装过的请求对象.
     */
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    /**
     * Gets result.
     *
     * @return the result.获取调用接口返回的数据map
     */
    public Map<String, Object> getResult() {
        return result;
    }

    /**
     * Sets result.
     *
     * @param result the result,设置调用接口返回的数据map
     */
    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

}
