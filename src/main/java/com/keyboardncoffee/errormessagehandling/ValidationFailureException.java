package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class ValidationFailureException extends BaseException {

    public ValidationFailureException() {
        super(ErrorCode.VALIDATION_FAILED.getCode(), ErrorCode.VALIDATION_FAILED.getMessage());
    }

    public ValidationFailureException(String customMessage) {
        super(ErrorCode.VALIDATION_FAILED.getCode(), customMessage);
    }
}
