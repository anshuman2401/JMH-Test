package com.test.jmh.regex.impl;

import com.test.jmh.regex.RegexValidator;

import java.util.regex.Pattern;

public class MinLengthRegexValidator implements RegexValidator {

    private static final String PATTERN = ".{8,}";
    private static final Pattern REGEX = Pattern.compile(PATTERN, Pattern.CASE_INSENSITIVE);

    @Override
    public boolean validate(String string) {
        return REGEX.matcher(string).find();
    }

}