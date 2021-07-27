package com.test.jmh.mapper.impl;

import com.test.jmh.entries.TestDaoEntity;
import com.test.jmh.entries.TestEntry;
import com.test.jmh.mapper.Converter;

public class HandMappingConverter implements Converter {

    @Override
    public TestDaoEntity convert(TestEntry testEntry) {
        TestDaoEntity testDaoEntity = new TestDaoEntity();
        testEntry.setAge(testEntry.getAge());
        testEntry.setAllow(testEntry.isAllow());
        testEntry.setDob(testEntry.getDob());
        testEntry.setHealth(testEntry.getHealth());
        testEntry.setFirstName(testEntry.getFirstName());
        testEntry.setLastName(testEntry.getLastName());
        testEntry.setValue(testEntry.getValue());
        testEntry.setLastModifiedOn(testEntry.getLastModifiedOn());
        return testDaoEntity;
    }
}
