package com.test.jmh.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomUtils {

    public static String getRandomString(int len) {
        return RandomStringUtils.random(len, true, true);
    }

    public static String getRandomString() {
        return getRandomString(15);
    }

    public static String getRandomEmail() {
        return getRandomString() + "gmail.com";
    }

    public static String getRandomInvalidEmail() {
        return getRandomString() + "gmail.";
    }

    public static String getRandomEmailWithTrailingSpace() {
        return getRandomString() + "gmail.com   ";
    }
}
