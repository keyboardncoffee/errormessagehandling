package com.keyboardncoffee.errormessagehandler.helper;

import com.keyboardncoffee.errormessagehandler.base.BaseException;
import com.keyboardncoffee.errormessagehandler.model.ErrorResponse;

public class ErrorResponseFactory {

    public static ErrorResponse from(BaseException ex){
        return new ErrorResponse(ex.getCode(), ex.getMessage());
    }

    public static ErrorResponse generic(){
        return new ErrorResponse("ERR-GENERIC", "Something went wrong");
    }
}
