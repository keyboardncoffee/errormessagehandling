package com.keyboardncoffee.errormessagehandler.enums;

import com.keyboardncoffee.errormessagehandler.base.BaseErrorMessage;

public enum ErrorCode implements BaseErrorMessage {
    RESOURCE_NOT_FOUND("ERR-404", "The requested resource was not found"),
    UNAUTHORIZED_ACCESS("ERR-401", "You are not authorized to access this resource"),
    INTERNAL_SERVER_ERROR("ERR-500", "An unexpected error occurred"),
    VALIDATION_FAILED("ERR-400", "Validation failed for the request"),
    CONFLICT_ERROR("ERR-409", "There has been a conflict"),
    SERVICE_UNAVAILABLE("ERR-503", "The service is unavailable"),
    BUSINESS_RULE_ERROR("ERR-505", "The business rule has been reported");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }

}
