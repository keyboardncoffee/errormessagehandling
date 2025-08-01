package com.keyboardncoffee.errormessagehandling.base;

import com.keyboardncoffee.errormessagehandling.ObjectAlreadyExistException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseExceptionTest {

    @Test
    void exceptionContainsCodeAndMessage(){
        BaseException ex = new ObjectAlreadyExistException("Duplicate entry found");
        assertEquals("ERR-409", ex.getCode());
        assertEquals("Duplicate entry found", ex.getMessage());
    }
}
