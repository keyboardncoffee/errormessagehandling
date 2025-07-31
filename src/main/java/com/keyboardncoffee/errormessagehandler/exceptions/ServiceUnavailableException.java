package com.keyboardncoffee.errormessagehandler.exceptions;

import com.keyboardncoffee.errormessagehandler.base.BaseException;
import com.keyboardncoffee.errormessagehandler.enums.ErrorCode;

public class ServiceUnavailableException extends BaseException {

    public ServiceUnavailableException() {
        super(ErrorCode.SERVICE_UNAVAILABLE.getCode(), ErrorCode.SERVICE_UNAVAILABLE.getMessage());
    }

    public ServiceUnavailableException(String customMessage) {
        super(ErrorCode.SERVICE_UNAVAILABLE.getCode(), customMessage);
    }
}
