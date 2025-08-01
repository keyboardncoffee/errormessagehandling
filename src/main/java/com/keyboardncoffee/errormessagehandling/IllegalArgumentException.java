package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class IllegalArgumentException extends BaseException {

    public IllegalArgumentException() {
        super(ErrorCode.ILLEGAL_ARGUMENT_ERROR.getCode(), ErrorCode.ILLEGAL_ARGUMENT_ERROR.getMessage());
    }

    public IllegalArgumentException(String customMessage) {
        super(ErrorCode.ILLEGAL_ARGUMENT_ERROR.getCode(), customMessage);
    }
}
