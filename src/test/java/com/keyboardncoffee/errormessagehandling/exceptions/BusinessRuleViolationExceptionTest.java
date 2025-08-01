package com.keyboardncoffee.errormessagehandling.exceptions;

import com.keyboardncoffee.errormessagehandling.BadRequestException;

public class BusinessRuleViolationExceptionTest {

    public void testDefaultMessage() {
        BadRequestException ex = new BadRequestException();
        assert "ERR-BUSINESS-RULE".equals(ex.getCode());
        assert ex.getMessage().contains("Business rule violated");
    }

    public void testCustomMessage() {
        String msg = "You can't book two rides at once";
        BadRequestException ex = new BadRequestException(msg);
        assert "ERR-BUSINESS-RULE".equals(ex.getCode());
        assert msg.equals(ex.getMessage());
    }
}
