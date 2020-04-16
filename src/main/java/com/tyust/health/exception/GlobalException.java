package com.tyust.health.exception;

import com.tyust.health.result.CodeMsg;

/**
 * 自定义业务抛出的运行时异常
 * @Author 郭志武
 * @Date 2020/4/12 23:24
 * @Version 1.0
 */
public class GlobalException extends RuntimeException{

    private static final long serialVersionUID = -7548513773781273460L;

    private CodeMsg codeMsg;

    public GlobalException(CodeMsg cm){
        super(cm.toString());
        this.codeMsg = cm;
    }

    public CodeMsg getCodeMsg() {
        return codeMsg;
    }
}
