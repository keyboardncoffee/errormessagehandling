package com.keyboardncoffee.errormessagehandler;

import com.keyboardncoffee.errormessagehandler.base.BaseException;
import com.keyboardncoffee.errormessagehandler.enums.ErrorCode;

public class BusinessRuleViolationException extends BaseException {

    public BusinessRuleViolationException(){
        super(ErrorCode.BUSINESS_RULE_ERROR.getCode(),  ErrorCode.BUSINESS_RULE_ERROR.getMessage());
    }

    public BusinessRuleViolationException(String customMessage){
        super(ErrorCode.BUSINESS_RULE_ERROR.getCode(), customMessage);
    }
}
