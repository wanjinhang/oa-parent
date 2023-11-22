package com.wansui.common.handler;

import com.wansui.common.execption.MyException;
import com.wansui.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理类
 *
 * @author wansui
 * @date 2023/11/21
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 错误
     *
     * @param e E
     * @return @return {@link Result }
     * @author wansui
     * @date 2023/11/22
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
//        e.printStackTrace();
        return Result.fail().message(e.getMessage());
    }

    /**
     * 错误
     *
     * @param e E
     * @return @return {@link Result }
     * @author wansui
     * @date 2023/11/22
     */
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result error(ArithmeticException e){
        e.printStackTrace();
        return Result.fail().message("执行了特定异常处理");
    }

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public Result error(MyException e){
        e.printStackTrace();
        return Result.fail().message(e.getMessage()).code(e.getCode());
    }
}