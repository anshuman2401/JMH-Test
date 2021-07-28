package com.test.jmh.jsonmapper;

import com.google.gson.Gson;
import com.test.jmh.entries.TestEntry;
import com.test.jmh.jsonmapper.impl.GsonMapper;
import com.test.jmh.jsonmapper.impl.JacksonMapper;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.ArrayList;
import java.util.List;

@State(Scope.Benchmark)
public class ExecutionPlan {

    public int iterations = 500;
    public List<TestEntry> testEntryList;
    public List<String> testEntryStringList;
    public GsonMapper gsonMapper;
    public JacksonMapper jacksonMapper;
    private final Gson gson = new Gson();

    @Setup(Level.Iteration)
    public void setUp() {
        gsonMapper = new GsonMapper();
        jacksonMapper = new JacksonMapper();

        testEntryList = new ArrayList<>();
        testEntryStringList = new ArrayList<>();

        for (int i = 0; i < iterations; i++) {
            TestEntry testEntry = new TestEntry();
            testEntry.setAge(23213);
            testEntry.setAllow(false);
            testEntry.setHealth(true);
            testEntry.setFirstName("Anshuman Kaushik test big string what should be the length of string to test it");
            testEntry.setLastName("Kaushik");
            testEntry.setValue(2423234);
            testEntry.setLastModifiedOn(234332423432234L);
            testEntryList.add(testEntry);
        }

        for (int i = 0; i < iterations; i++) {
            testEntryStringList.add(gson.toJson(testEntryList.get(i)));
        }
    }
}
