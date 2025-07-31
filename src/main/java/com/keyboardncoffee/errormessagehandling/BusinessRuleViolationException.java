package com.keyboardncoffee.errormessagehandling;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.enums.ErrorCode;

public class BusinessRuleViolationException extends BaseException {

    public BusinessRuleViolationException(){
        super(ErrorCode.BUSINESS_RULE_ERROR.getCode(),  ErrorCode.BUSINESS_RULE_ERROR.getMessage());
    }

    public BusinessRuleViolationException(String customMessage){
        super(ErrorCode.BUSINESS_RULE_ERROR.getCode(), customMessage);
    }
}
