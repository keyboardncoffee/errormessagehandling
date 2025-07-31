package com.keyboardncoffee.errormessagehandler.exceptions;

import com.keyboardncoffee.errormessagehandler.base.BaseException;
import com.keyboardncoffee.errormessagehandler.enums.ErrorCode;

public class ValidationFailureException extends BaseException {

    public ValidationFailureException() {
        super(ErrorCode.VALIDATION_FAILED.getCode(), ErrorCode.VALIDATION_FAILED.getMessage());
    }

    public ValidationFailureException(String customMessage) {
        super(ErrorCode.VALIDATION_FAILED.getCode(), customMessage);
    }
}
