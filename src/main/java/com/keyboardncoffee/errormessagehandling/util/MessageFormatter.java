package com.keyboardncoffee.errormessagehandling.util;

import java.text.MessageFormat;

public class MessageFormatter {

    public static String formatMessage(String message, Object... args) {
        return MessageFormat.format(message, args);
    }
}
