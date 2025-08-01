package com.keyboardncoffee.errormessagehandling.enums;

import com.keyboardncoffee.errormessagehandling.base.BaseErrorMessage;

public enum ErrorCode implements BaseErrorMessage {
    OBJECT_NOT_FOUND("ERR-404", "The requested resource was not found or does not exist"),
    UNAUTHORIZED_ACCESS("ERR-401", "You are not authorized to access this resource"),
    INTERNAL_SERVER_ERROR("ERR-500", "An unexpected error occurred"),
    VALIDATION_FAILED("ERR-400", "Validation failed for the request"),
    OBJECT_ALREADY_EXIST_ERROR("ERR-409", "There has been a conflict"),
    SERVICE_UNAVAILABLE("ERR-503", "The service is unavailable"),
    BAD_REQUEST_ERROR("ERR-505", "The business rule has been reported"),
    ILLEGAL_ARGUMENT_ERROR("ERR-408", "The entered data is not permitted here"),
    NULL_ERROR("ERR-500", "The requested resource is null");

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
