package com.test.jmh.jsonmapper.impl;

import com.test.jmh.entries.TestEntry;
import com.test.jmh.jsonmapper.Mapper;

public class BlankMapper implements Mapper {

    @Override
    public TestEntry toJson(String value) {
        return null;
    }

    @Override
    public String fromJson(TestEntry value) {
        return null;
    }
}
