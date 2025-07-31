package com.keyboardncoffee.errormessagehandling.exceptions;

import com.keyboardncoffee.errormessagehandling.BusinessRuleViolationException;

public class BusinessRuleViolationExceptionTest {

    public void testDefaultMessage() {
        BusinessRuleViolationException ex = new BusinessRuleViolationException();
        assert "ERR-BUSINESS-RULE".equals(ex.getCode());
        assert ex.getMessage().contains("Business rule violated");
    }

    public void testCustomMessage() {
        String msg = "You can't book two rides at once";
        BusinessRuleViolationException ex = new BusinessRuleViolationException(msg);
        assert "ERR-BUSINESS-RULE".equals(ex.getCode());
        assert msg.equals(ex.getMessage());
    }
}
