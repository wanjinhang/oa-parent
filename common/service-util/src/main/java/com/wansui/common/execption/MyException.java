package com.wansui.common.execption;

import com.wansui.common.result.ResultCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 自定义全局异常类
 *
 * @author wansui
 * @date 2023/11/22
 * @see RuntimeException
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class MyException extends RuntimeException {

    private Integer code;

    private String message;

    /**
     * 通过状态码和错误消息创建异常对象
     *
     * @param code    代码
     * @param message 讯息
     * @return
     * @author wansui
     * @date 2023/11/22
     */
    public MyException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }


    /**
     * 我例外
     *
     * @param resultCodeEnum 结果代码枚举
     * @return
     * @author wansui
     * @date 2023/11/22
     */
    public MyException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
    }

    @Override
    public String toString() {
        return "MyException{" +
                "code=" + code +
                ", message=" + this.getMessage() +
                '}';
    }
}