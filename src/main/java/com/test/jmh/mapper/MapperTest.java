package com.test.jmh.mapper;

import com.test.jmh.mapper.impl.MapStructConverter;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

public class MapperTest {

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void blankMapperTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        blackhole.consume(executionPlan.blankConverter.convert(executionPlan.testEntry));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void handMapperTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        blackhole.consume(executionPlan.handMappingConverter.convert(executionPlan.testEntry));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void modelMapperTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        blackhole.consume(executionPlan.modelMapperConverter.convert(executionPlan.testEntry));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void modelStructMapperTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        blackhole.consume(MapStructConverter.INSTANCE.convert(executionPlan.testEntry));
    }
}
