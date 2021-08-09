package com.test.jmh.regex.impl;

import com.test.jmh.regex.RegexValidator;

public class StringMatchesValidator implements RegexValidator {

    @Override
    public boolean validate(String string) {
        return string.matches("^[\\w+-.]+(?:\\.[\\w+-]+)*@(?:[a-zA-Z0-9-]{1,35}+\\.)+[a-zA-Z]{2,35}$");
    }
}
