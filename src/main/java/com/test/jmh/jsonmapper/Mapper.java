package com.test.jmh.jsonmapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.jmh.entries.TestEntry;

public interface Mapper {

    TestEntry toJson(String value) throws JsonProcessingException;

    String fromJson(TestEntry value) throws Exception;

}
