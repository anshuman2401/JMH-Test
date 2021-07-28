package com.test.jmh.mapper;

import com.test.jmh.entries.TestEntry;
import com.test.jmh.mapper.impl.BlankConverter;
import com.test.jmh.mapper.impl.HandMappingConverter;
import com.test.jmh.mapper.impl.ModelMapperConverter;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ExecutionPlan {

    public TestEntry testEntry;
    public BlankConverter blankConverter;
    public HandMappingConverter handMappingConverter;
    public ModelMapperConverter modelMapperConverter;

    @Setup(Level.Invocation)
    public void setUp() {
        blankConverter = new BlankConverter();
        handMappingConverter = new HandMappingConverter();
        modelMapperConverter = new ModelMapperConverter();

        testEntry = new TestEntry();
        testEntry.setAge(23);
        testEntry.setAllow(false);
        testEntry.setHealth(true);
        testEntry.setFirstName("Anshuman");
        testEntry.setLastName("Kaushik");
        testEntry.setValue(2423);
        testEntry.setLastModifiedOn(2343324L);
    }
}
