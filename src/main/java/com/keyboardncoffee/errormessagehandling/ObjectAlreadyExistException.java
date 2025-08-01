package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class ObjectAlreadyExistException extends BaseException {

    public ObjectAlreadyExistException() {
        super(ErrorCode.OBJECT_ALREADY_EXIST_ERROR.getCode(), ErrorCode.OBJECT_ALREADY_EXIST_ERROR.getMessage());
    }

    public ObjectAlreadyExistException(String customMessage) {
        super(ErrorCode.OBJECT_ALREADY_EXIST_ERROR.getCode(), customMessage);
    }
}
