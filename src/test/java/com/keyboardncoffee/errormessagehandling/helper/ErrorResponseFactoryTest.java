package com.keyboardncoffee.errormessagehandling.helper;

import com.keyboardncoffee.errormessagehandling.base.BaseException;
import com.keyboardncoffee.errormessagehandling.ObjectAlreadyExistException;
import com.keyboardncoffee.errormessagehandling.model.ErrorResponse;

import java.time.Duration;
import java.time.Instant;

public class ErrorResponseFactoryTest {

    public void testFromBaseException() {
        BaseException ex = new ObjectAlreadyExistException("Username already exists");
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
