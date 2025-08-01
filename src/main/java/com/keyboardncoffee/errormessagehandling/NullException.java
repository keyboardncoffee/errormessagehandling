package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class NullException extends BaseException {

    public NullException() {
        super(ErrorCode.NULL_ERROR.getCode(), ErrorCode.NULL_ERROR.getMessage());
    }

    public NullException(String customMessage) {
        super(ErrorCode.NULL_ERROR.getCode(), customMessage);
    }
}
