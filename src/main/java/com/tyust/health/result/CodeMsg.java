package com.tyust.health.result;


/**
 * 进一步封装Result的错误
 * @Author 郭志武
 * @Date 2020/4/12 14:05
 * @Version 1.0
 */
public class CodeMsg {
    private int code;  //错误码
    private String msg; //错误信息

    //通用模块 5001XX
    public static CodeMsg SUCCESS = new CodeMsg(0,"success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
    public static CodeMsg USER_NO_EXIST = new CodeMsg(500101,"用户不存在");
    public static CodeMsg USER_ERROR = new CodeMsg(500102,"账户名错误");
    public static CodeMsg PASSWORD_ERROR = new CodeMsg(500103,"密码错误");
    public static CodeMsg EMPTY_PAGESIZE_OR_PAGEINDEX = new CodeMsg(500104,"空的页码或者页面大小");

    //健康卡管理模块  5002XX

    //返校通知书模块（生成，发放，接收，查看）5003XX
    public static CodeMsg RESPECT_CREATE = new CodeMsg(500300,"本批次已为此人生成返校通知书");

    //返校计划上报模块 5004XX

    //返校接待模块 5005XX

    //统计分析模块  5006XX

    public CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "CodeMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
