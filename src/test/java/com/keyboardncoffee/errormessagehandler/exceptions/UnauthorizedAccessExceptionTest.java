package com.keyboardncoffee.errormessagehandler.exceptions;

public class UnauthorizedAccessExceptionTest {

    public void testDefaultMessage() {
        UnauthorizedAccessException ex = new UnauthorizedAccessException();
        assert "ERR-401".equals(ex.getCode()) : "Expected ERR-401";
        assert "You are not authorized to access this resource".equals(ex.getMessage()) : "Default message mismatch";
    }

    public void testCustomMessage() {
        String msg = "Unauthorized access";
        UnauthorizedAccessException ex = new UnauthorizedAccessException(msg);
        assert "ERR-401".equals(ex.getCode()) : "Expected ERR-401";
        assert msg.equals(ex.getMessage()) : "Custom message mismatch";
    }
}
