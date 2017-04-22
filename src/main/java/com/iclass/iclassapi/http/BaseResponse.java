package com.iclass.iclassapi.http;

/**
 * Created by Daniel on 2017/4/16.
 * Function :
 */
public class BaseResponse {
    private STATUS status;
    private Object data;
    private String errorMessage;

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public enum STATUS{
        SUCCESS,FAIL
    }
}
