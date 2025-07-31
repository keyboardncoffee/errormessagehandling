package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class ResourceNotFoundException extends BaseException {

    public ResourceNotFoundException(){
        super(ErrorCode.RESOURCE_NOT_FOUND.getCode(), ErrorCode.RESOURCE_NOT_FOUND.getMessage());

    }

    public ResourceNotFoundException(String customMessage){
        super(ErrorCode.RESOURCE_NOT_FOUND.getCode(), customMessage);
    }
}
