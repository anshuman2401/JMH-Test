package com.test.jmh.mapper.impl;

import com.test.jmh.entries.TestDaoEntity;
import com.test.jmh.entries.TestEntry;
import com.test.jmh.mapper.Converter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapStructConverter extends Converter {

    MapStructConverter INSTANCE = Mappers.getMapper(MapStructConverter.class);

    @Override
    TestDaoEntity convert(TestEntry sourceOrder);
}
