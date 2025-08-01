package com.keyboardncoffee.errormessagehandling.exceptions;

import com.keyboardncoffee.errormessagehandling.ObjectAlreadyExistException;

public class ConflictExceptionTest {

    public void testDefaultMessage() {
        ObjectAlreadyExistException ex = new ObjectAlreadyExistException();
        assert "ERR-409".equals(ex.getCode());
        assert ex.getMessage().contains("Conflict");
    }

    public void testCustomMessage() {
        String msg = "Username already exists";
        ObjectAlreadyExistException ex = new ObjectAlreadyExistException(msg);
        assert "ERR-409".equals(ex.getCode());
        assert msg.equals(ex.getMessage());
    }

}
