package com.test.jmh.mapper.impl;

import com.test.jmh.entries.TestDaoEntity;
import com.test.jmh.entries.TestEntry;
import com.test.jmh.mapper.Converter;

public class BlankConverter implements Converter {

    @Override
    public TestDaoEntity convert(TestEntry testEntry) {
        return null;
    }
}
