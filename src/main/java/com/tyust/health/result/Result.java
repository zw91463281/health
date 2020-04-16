package com.tyust.health.result;

import java.util.List;

/**
 * 封装一组接口返回的JSON数据
 * 前端通过Ajax获取的数据必须是这种格式
 * @Author 郭志武
 * @Date 2020/4/12 13:48
 * @Version 1.0
 */
public class Result {
    private int code;  //错误码
    private String msg; //错误信息
    private long count; //返回数据条数
    private List data; //成功后返回的数据列表

    /**
     * 成功时调用的方法
     * @param data  返回给前端的数据列表
     * @return   返回一组JSON数据
     */
    public static Result success(List data){
        return new Result(data);
    }

    /**
     * 失败时调用的方法
     * @param codeMsg 返回给前端的错误码和错误信息
     * @return 返回一组JSON数据
     */
    public static Result error(CodeMsg codeMsg){
        return new Result(codeMsg);
    }

    //成功时的构造器
    private Result(List data) {
        this.code = 0;
        this.msg = "success";
        this.count = data.size();
        this.data = data;
    }

    //失败时的构造器
    private Result(CodeMsg codeMsg) {
        if (codeMsg == null){
            return;
        }
        this.code = codeMsg.getCode();
        this.msg = codeMsg.getMsg();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public long getCount() {
        return count;
    }

    public List getData() {
        return data;
    }
}
