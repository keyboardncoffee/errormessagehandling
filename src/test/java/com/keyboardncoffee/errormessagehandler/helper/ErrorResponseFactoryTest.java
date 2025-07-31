package com.keyboardncoffee.errormessagehandler.helper;

import com.keyboardncoffee.errormessagehandler.base.BaseException;
import com.keyboardncoffee.errormessagehandler.exceptions.ConflictException;
import com.keyboardncoffee.errormessagehandler.model.ErrorResponse;

import java.time.Duration;
import java.time.Instant;

public class ErrorResponseFactoryTest {

    public void testFromBaseException() {
        BaseException ex = new ConflictException("Username already exists");
        ErrorResponse response = ErrorResponseFactory.from(ex);

        assert "ERR-409".equals(response.getCode()) : "Expected ERR-409";
        assert "Username already exists".equals(response.getMessage()) : "Message mismatch";
        assert response.getTimestamp() != null : "Timestamp should not be null";
        assert Duration.between(response.getTimestamp(), Instant.now()).getSeconds() < 3
                : "Timestamp should be recent";
    }

    public void testGeneric() {
        ErrorResponse response = ErrorResponseFactory.generic();

        assert "ERR-GENERIC".equals(response.getCode()) : "Expected ERR-GENERIC";
        assert "Something went wrong".equals(response.getMessage()) : "Generic message mismatch";
        assert response.getTimestamp() != null : "Timestamp should not be null";
        assert Duration.between(response.getTimestamp(), Instant.now()).getSeconds() < 3
                : "Timestamp should be recent";
    }
}
