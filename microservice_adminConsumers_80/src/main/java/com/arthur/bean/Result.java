package com.arthur.bean;

public class Result<T> {
    static String SUCCESS_CODE = "0000";
    static String ERROR_CODE = "1111";
    private String code;
    private T data;
    private String msg = "ok";

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private Result() {
    }

    private Result(String code, T data, String msg) {
        this.code=code;
        this.data=data;
        this.msg=msg;
    }


    public static Result success() {
        return new Result<>(SUCCESS_CODE, true, "ok");
    }
    public static <T> Result success(T t) {
        return new Result<>(SUCCESS_CODE, t, "ok");
    }
    public static <T> Result success(String msg) {
        return new Result<>(SUCCESS_CODE, true, msg);
    }
    public static Result fail() {
        return new Result<>(ERROR_CODE,false, "系统错误");
    }
    public static Result fail(String message) {
        return new Result<>(ERROR_CODE,false, message);
    }
    public static Result fail(String error, String message) {
        return new Result<>(error,false, message);
    }
}
