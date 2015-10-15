/*
 * Copyright (c) 2015. qiatuhangzhou
 */

package com.jihelife.search.web.interceptors;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by CHECHI on 2015/8/1.
 *
 * 基础拦截器,用于基础app签名方法的验证,基础参数的验证工作
 */
public class BaseInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
}
