package com.keyboardncoffee.errormessagehandler;

import com.keyboardncoffee.errormessagehandler.base.BaseException;
import com.keyboardncoffee.errormessagehandler.enums.ErrorCode;

public class ResourceNotFoundException extends BaseException {

    public ResourceNotFoundException(){
        super(ErrorCode.RESOURCE_NOT_FOUND.getCode(), ErrorCode.RESOURCE_NOT_FOUND.getMessage());

    }

    public ResourceNotFoundException(String customMessage){
        super(ErrorCode.RESOURCE_NOT_FOUND.getCode(), customMessage);
    }
}
