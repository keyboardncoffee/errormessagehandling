package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class BadRequestException extends BaseException {

    public BadRequestException(){
        super(ErrorCode.BAD_REQUEST_ERROR.getCode(),  ErrorCode.BAD_REQUEST_ERROR.getMessage());
    }

    public BadRequestException(String customMessage){
        super(ErrorCode.BAD_REQUEST_ERROR.getCode(), customMessage);
    }
}
