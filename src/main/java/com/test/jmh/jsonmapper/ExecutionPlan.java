package com.test.jmh.jsonmapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.test.jmh.entries.TestEntry;
import com.test.jmh.jsonmapper.impl.BlankMapper;
import com.test.jmh.jsonmapper.impl.GsonMapper;
import com.test.jmh.jsonmapper.impl.JacksonMapper;
import com.test.jmh.mapper.impl.BlankConverter;
import com.test.jmh.mapper.impl.HandMappingConverter;
import com.test.jmh.mapper.impl.ModelMapperConverter;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.Date;

@State(Scope.Benchmark)
public class ExecutionPlan {

    public int iterations = 100;
    public TestEntry testEntry;
    public String testEntryString;
    public String testEntryJacksonString;
    public BlankMapper blankMapper;
    public GsonMapper gsonMapper;
    public JacksonMapper jacksonMapper;
    private final Gson gson = new Gson();
    private final ObjectMapper mapper = new ObjectMapper();

    @Setup(Level.Invocation)
    public void setUp() {
        blankMapper = new BlankMapper();
        gsonMapper = new GsonMapper();
        jacksonMapper = new JacksonMapper();

        testEntry = new TestEntry();
        testEntry.setAge(23);
        testEntry.setAllow(false);
        testEntry.setDob(new Date());
        testEntry.setHealth(true);
        testEntry.setFirstName("Anshuman");
        testEntry.setLastName("Kaushik");
        testEntry.setValue(2423);
        testEntry.setLastModifiedOn(2343324L);

        testEntryString = gson.toJson(testEntry);
        try {
            testEntryJacksonString = mapper.writeValueAsString(testEntry);
        }catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
