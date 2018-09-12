package com.nn.start_mybatis.vo;


public class JsonResult {


    private String status = null;


    private Object result = null;


    public JsonResult status(String status) {


        this.status = status;


        return this;


    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public Object getResult() {
        return result;
    }


}