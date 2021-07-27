package com.test.jmh.mapper.impl;

import com.test.jmh.entries.TestDaoEntity;
import com.test.jmh.entries.TestEntry;
import com.test.jmh.mapper.Converter;
import org.modelmapper.ModelMapper;

public class ModelMapperConverter implements Converter {

    private final ModelMapper modelMapper;

    public ModelMapperConverter() {
        modelMapper = new ModelMapper();
    }

    @Override
    public TestDaoEntity convert(TestEntry testEntry) {
        return modelMapper.map(testEntry, TestDaoEntity.class);
    }
}
