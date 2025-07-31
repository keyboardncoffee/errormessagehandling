package com.keyboardncoffee.errormessagehandler;

import com.keyboardncoffee.errormessagehandler.base.BaseException;
import com.keyboardncoffee.errormessagehandler.enums.ErrorCode;

public class ConflictException extends BaseException {

    public ConflictException() {
        super(ErrorCode.CONFLICT_ERROR.getCode(), ErrorCode.CONFLICT_ERROR.getMessage());
    }

    public ConflictException(String customMessage) {
        super(ErrorCode.CONFLICT_ERROR.getCode(), customMessage);
    }
}
