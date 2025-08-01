package com.keyboardncoffee.errormessagehandling.exceptions;

import com.keyboardncoffee.errormessagehandling.ObjectNotFoundException;

public class ResourceNotFoundExceptionTest {

    public void testDefaultMessage() {
        ObjectNotFoundException ex = new ObjectNotFoundException();
        assert "ERR-404".equals(ex.getCode()) : "Expected ERR-404";
        assert "The requested resource was not found".equals(ex.getMessage()) : "Default message mismatch";
    }

    public void testCustomMessage() {
        String msg = "Item not found";
        ObjectNotFoundException ex = new ObjectNotFoundException(msg);
        assert "ERR-404".equals(ex.getCode()) : "Expected ERR-404";
        assert msg.equals(ex.getMessage()) : "Custom message mismatch";
    }
}