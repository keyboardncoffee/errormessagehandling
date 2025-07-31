package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class UnauthorizedAccessException extends BaseException {

    public UnauthorizedAccessException() {
        super(ErrorCode.UNAUTHORIZED_ACCESS.getCode(), ErrorCode.UNAUTHORIZED_ACCESS.getMessage());
    }

    public UnauthorizedAccessException(String customMessage) {
        super(ErrorCode.UNAUTHORIZED_ACCESS.getCode(), customMessage);
    }
}
