package com.keyboardncoffee.errormessagehandler.exceptions;

public class ConflictExceptionTest {

    public void testDefaultMessage() {
        ConflictException ex = new ConflictException();
        assert "ERR-409".equals(ex.getCode());
        assert ex.getMessage().contains("Conflict");
    }

    public void testCustomMessage() {
        String msg = "Username already exists";
        ConflictException ex = new ConflictException(msg);
        assert "ERR-409".equals(ex.getCode());
        assert msg.equals(ex.getMessage());
    }

}
