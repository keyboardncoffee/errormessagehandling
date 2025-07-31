package com.keyboardncoffee.errormessagehandling.exceptions;

import com.keyboardncoffee.errormessagehandling.ValidationFailureException;

public class ValidationFailureExceptionTest {

    public void testDefaultMessage() {
        ValidationFailureException ex = new ValidationFailureException();
        assert "ERR-400".equals(ex.getCode());
        assert "Validation failed for the request".equals(ex.getMessage());
    }

    public void testCustomMessage() {
        String msg = "Phone number format invalid";
        ValidationFailureException ex = new ValidationFailureException(msg);
        assert "ERR-400".equals(ex.getCode());
        assert msg.equals(ex.getMessage());
    }
}
