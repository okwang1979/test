package com.nn.start_mybatis.vo;


public class JsonResult {





    private String status = null;


    private Object result = null;


    public static JsonResult getSuccess(Object result){
        JsonResult r = new JsonResult();
        r.setStatus("SUCCESS");
        r.setResult(result);
        return r;

    }

    public static JsonResult getFailed(Object errInfo){
        JsonResult r = new JsonResult();
        r.setStatus("err");
        r.setResult(errInfo);
        return r;
    }


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