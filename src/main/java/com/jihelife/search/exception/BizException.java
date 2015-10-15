/*
 * Copyright (c) 2015. qiatuhangzhou
 */
package com.jihelife.search.exception;

/**
 * Created by CHECHI on 2015/8/1.
 */
public class BizException extends Exception {

    private String code;

    private String bizExMessage;

    /**
     * Instantiates a new Biz exception.
     *
     * @param code    the code 业务异常代码需要app识别业务异常码 @see  com.jihelife.search.constants.ApplicationConstants
     * @param message the message 业务异常信息提示,用户调试,app不会显示具体的业务异常提示信息
     */
    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * Gets code.业务异常状态码.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets code.业务异常状态码.
     *
     * @param code the code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets biz ex message.业务异常提示信息.
     *
     * @return the biz ex message
     */
    public String getBizExMessage() {
        return bizExMessage;
    }

    /**
     * Sets biz ex message.业务异常提示信息.
     *
     * @param bizExMessage the biz ex message
     */
    public void setBizExMessage(String bizExMessage) {
        this.bizExMessage = bizExMessage;
    }
}
