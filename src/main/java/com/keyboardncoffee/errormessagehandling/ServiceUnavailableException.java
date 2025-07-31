package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class ServiceUnavailableException extends BaseException {

    public ServiceUnavailableException() {
        super(ErrorCode.SERVICE_UNAVAILABLE.getCode(), ErrorCode.SERVICE_UNAVAILABLE.getMessage());
    }

    public ServiceUnavailableException(String customMessage) {
        super(ErrorCode.SERVICE_UNAVAILABLE.getCode(), customMessage);
    }
}
