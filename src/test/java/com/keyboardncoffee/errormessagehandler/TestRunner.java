package com.keyboardncoffee.errormessagehandler;

import com.keyboardncoffee.errormessagehandler.exceptions.*;
import com.keyboardncoffee.errormessagehandler.helper.ErrorResponseFactoryTest;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class TestRunner {
    public static void runTests(Class<?> testClass) {
        try {
            Object instance = testClass.getDeclaredConstructor().newInstance();
            for (Method method : testClass.getDeclaredMethods()) {
                if (method.getName().startsWith("test")) {
                    try {
                        method.invoke(instance);
                        System.out.println("Success; " + testClass.getSimpleName() + " > " + method.getName() + " passed");
                    } catch (Throwable t) {
                        System.err.println(testClass.getSimpleName() + " > " + method.getName() + " failed: " + t.getCause());
                    }
                }
            }
        } catch (Exception e) {
            System.err.println("Failed to instantiate " + testClass.getName() + ": " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Class<?>> tests = Arrays.asList(
                ResourceNotFoundExceptionTest.class,
                UnauthorizedAccessExceptionTest.class,
                ValidationFailureExceptionTest.class,
                ConflictExceptionTest.class,
                ServiceUnavailableExceptionTest.class,
                BusinessRuleViolationExceptionTest.class,
                ErrorResponseFactoryTest.class
        );

        for (Class<?> testClass : tests) {
            runTests(testClass);
        }
    }
}
