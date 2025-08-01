package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class ObjectNotFoundException extends BaseException {

    public ObjectNotFoundException(){
        super(ErrorCode.OBJECT_NOT_FOUND.getCode(), ErrorCode.OBJECT_NOT_FOUND.getMessage());

    }

    public ObjectNotFoundException(String customMessage){
        super(ErrorCode.OBJECT_NOT_FOUND.getCode(), customMessage);
    }
}
