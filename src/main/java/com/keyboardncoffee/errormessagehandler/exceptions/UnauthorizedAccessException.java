package com.keyboardncoffee.errormessagehandler.exceptions;

import com.keyboardncoffee.errormessagehandler.base.BaseException;
import com.keyboardncoffee.errormessagehandler.enums.ErrorCode;

public class UnauthorizedAccessException extends BaseException {

    public UnauthorizedAccessException() {
        super(ErrorCode.UNAUTHORIZED_ACCESS.getCode(), ErrorCode.UNAUTHORIZED_ACCESS.getMessage());
    }

    public UnauthorizedAccessException(String customMessage) {
        super(ErrorCode.UNAUTHORIZED_ACCESS.getCode(), customMessage);
    }
}
