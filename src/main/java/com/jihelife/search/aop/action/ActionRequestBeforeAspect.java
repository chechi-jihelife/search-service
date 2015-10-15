/*
 * Copyright (c) 2015. qiatuhangzhou
 */

package com.jihelife.search.aop.action;

import com.jihelife.search.constants.ResultCode;
import com.jihelife.search.web.BaseAction;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * search-service
 * 具体的接口调用前初始化方法,初始化接口调用返回信息
 */
@Aspect
@Component
public class ActionRequestBeforeAspect {

    /**
     * Request before.
     * 接口调用前初始化接口返回信息map,设置接口调用返回信息默认状态sc=0,
     * 接口返回状态sc需要重写,具体的业务接口自己修改sc
     *
     * @param joinPoint the join point BaseAction的子类
     */
    @Before(value = "execution(public java.util.Map<String,Object> com.jihelife.search.web.action.*.*(..))")
    public void requestBefore(JoinPoint joinPoint) {
        BaseAction action = (BaseAction) joinPoint.getThis();
        Map<String, Object> result = new HashMap<String, Object>();
        result.put(ResultCode.RESULT_SC, "0");
        action.setResult(result);
    }
}
