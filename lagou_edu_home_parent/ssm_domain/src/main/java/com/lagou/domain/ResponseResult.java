package com.lagou.domain;

/**
 * @author 张岩
 * @version 1.0
 */
public class ResponseResult {
    private Boolean success;
    private Integer state;
    private String message;
    private Object content;

    public ResponseResult(Boolean success, Integer state, String message, Object content) {
        this.success = success;
        this.state = state;
        this.message = message;
        this.content = content;
    }

    public ResponseResult() {
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}