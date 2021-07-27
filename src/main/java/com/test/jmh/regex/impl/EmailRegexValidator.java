package com.test.jmh.regex.impl;

import com.test.jmh.regex.RegexValidator;

import java.util.regex.Pattern;

public class EmailRegexValidator implements RegexValidator {

    private static final String EMAIL_PATTERN = "^[\\w+-.]+(?:\\.[\\w+-]+)*@(?:[a-zA-Z0-9-]{1,35}+\\.)+[a-zA-Z]{2,35}$";
    private static final Pattern EMAIL_REGEX = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    @Override
    public boolean validate(String string) {
        return EMAIL_REGEX.matcher(string).find();
    }
}
