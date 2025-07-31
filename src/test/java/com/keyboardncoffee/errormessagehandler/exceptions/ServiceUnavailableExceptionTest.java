package com.keyboardncoffee.errormessagehandler.exceptions;

import com.keyboardncoffee.errormessagehandler.ServiceUnavailableException;

public class ServiceUnavailableExceptionTest {

    public void testDefaultMessage() {
        ServiceUnavailableException ex = new ServiceUnavailableException();
        assert "ERR-SERVICE-UNAVAILABLE".equals(ex.getCode());
        assert ex.getMessage().contains("Service is currently unavailable");
    }

    public void testCustomMessage() {
        String msg = "Payment service unreachable";
        ServiceUnavailableException ex = new ServiceUnavailableException(msg);
        assert "ERR-SERVICE-UNAVAILABLE".equals(ex.getCode());
        assert msg.equals(ex.getMessage());
    }
}
