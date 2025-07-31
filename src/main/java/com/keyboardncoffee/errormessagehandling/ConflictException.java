package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class ConflictException extends BaseException {

    public ConflictException() {
        super(ErrorCode.CONFLICT_ERROR.getCode(), ErrorCode.CONFLICT_ERROR.getMessage());
    }

    public ConflictException(String customMessage) {
        super(ErrorCode.CONFLICT_ERROR.getCode(), customMessage);
    }
}
