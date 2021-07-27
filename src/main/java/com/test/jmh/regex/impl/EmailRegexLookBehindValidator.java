package com.test.jmh.regex.impl;

import com.test.jmh.regex.RegexValidator;

import java.util.regex.Pattern;

public class EmailRegexLookBehindValidator implements RegexValidator {

    private static final String EMAIL_PATTERN = "^([A-Za-z0-9_+\\-]+[\\.]?)+@((?!-)[A-Za-z0-9-]{1,63}(?<!-)\\.)+[A-Za-z0-9]{2,}$";
    private static final Pattern EMAIL_REGEX = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);

    @Override
    public boolean validate(String string) {
        return EMAIL_REGEX.matcher(string).find();
    }
}
