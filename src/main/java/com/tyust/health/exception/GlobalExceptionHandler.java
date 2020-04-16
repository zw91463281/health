package com.tyust.health.exception;

import com.tyust.health.result.CodeMsg;
import com.tyust.health.result.Result;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常捕捉处理，做一个切面
 * @Author 郭志武
 * @Date 2020/4/12 23:35
 * @Version 1.0
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result Exception(HttpServletRequest request, Exception e) throws Exception {
        //将异常信息打印出来
        e.printStackTrace();

        /*
        如果碰到了某个自定义异常加上了@ResponseStatus，就继续抛出，这样就不会让自定义异常失去加上@ResponseStatus的初衷。
         */
        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null){
            throw e;
        }

        if (e instanceof GlobalException) {
            //抛出了运行时异常的处理
            GlobalException ge = (GlobalException)e;
            return Result.error(ge.getCodeMsg());

        } else {
            return Result.error(CodeMsg.SERVER_ERROR);
        }

    }

}
