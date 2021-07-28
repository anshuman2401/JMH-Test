package com.test.jmh.jsonmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.jmh.entries.TestEntry;

public interface Mapper {

    String toJson(TestEntry value) throws JsonProcessingException;

    TestEntry fromJson(String value) throws Exception;

}
