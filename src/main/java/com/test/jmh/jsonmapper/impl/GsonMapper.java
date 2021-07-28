package com.test.jmh.jsonmapper.impl;

import com.google.gson.Gson;
import com.test.jmh.entries.TestEntry;
import com.test.jmh.jsonmapper.Mapper;

public class GsonMapper implements Mapper {

    private final Gson gson = new Gson();

    @Override
    public String toJson(TestEntry value) {
        return gson.toJson(value);
    }

    @Override
    public TestEntry fromJson(String value) {
        return gson.fromJson(value, TestEntry.class);
    }
}
