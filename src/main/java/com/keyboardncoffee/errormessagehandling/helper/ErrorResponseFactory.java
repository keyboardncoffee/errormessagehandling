package com.keyboardncoffee.errormessagehandling.helper;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.model.ErrorResponse;

public class ErrorResponseFactory {

    public static ErrorResponse from(BaseException ex){
        return new ErrorResponse(ex.getCode(), ex.getMessage());
    }

    public static ErrorResponse generic(){
        return new ErrorResponse("ERR-GENERIC", "Something went wrong");
    }
}
