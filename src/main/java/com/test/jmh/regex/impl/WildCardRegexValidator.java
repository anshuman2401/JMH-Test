package com.test.jmh.regex.impl;

import com.test.jmh.regex.RegexValidator;

import java.util.regex.Pattern;

public class WildCardRegexValidator implements RegexValidator {

    private static final String PATTERN = "\\*";
    private static final Pattern REGEX = Pattern.compile(PATTERN, Pattern.CASE_INSENSITIVE);

    @Override
    public boolean validate(String string) {
        return REGEX.matcher(string).find();
    }

}
