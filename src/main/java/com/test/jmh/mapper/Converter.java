package com.test.jmh.mapper;

import com.test.jmh.entries.TestDaoEntity;
import com.test.jmh.entries.TestEntry;

public interface Converter {

    TestDaoEntity convert(TestEntry testEntry);
}
