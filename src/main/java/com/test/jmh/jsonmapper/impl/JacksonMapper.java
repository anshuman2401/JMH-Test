package com.test.jmh.jsonmapper.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.jmh.entries.TestEntry;
import com.test.jmh.jsonmapper.Mapper;

public class JacksonMapper implements Mapper {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public TestEntry toJson(String value) throws JsonProcessingException {
        return mapper.readValue(value, TestEntry.class);
    }

    @Override
    public String fromJson(TestEntry value) throws Exception {
        return mapper.writeValueAsString(value);
    }
}
