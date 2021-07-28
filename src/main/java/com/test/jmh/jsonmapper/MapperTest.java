package com.test.jmh.jsonmapper;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

public class MapperTest {

//    @Threads(Threads.MAX)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void gsonMapperToJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        for (int i =0 ; i < executionPlan.iterations; i++)
            blackhole.consume(executionPlan.gsonMapper.toJson(executionPlan.testEntryList.get(i)));
    }

//    @Threads(Threads.MAX)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void jacksonMapperToJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) throws Exception {
        for (int i =0 ; i < executionPlan.iterations; i++)
            blackhole.consume(executionPlan.jacksonMapper.toJson(executionPlan.testEntryList.get(i)));
    }

//    @Threads(Threads.MAX)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void gsonMapperFromJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        for (int i =0 ; i < executionPlan.iterations; i++)
            blackhole.consume(executionPlan.gsonMapper.fromJson(executionPlan.testEntryStringList.get(i)));
    }

//    @Threads(Threads.MAX)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void jacksonMapperFromJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) throws Exception {
        for (int i =0 ; i < executionPlan.iterations; i++)
            blackhole.consume(executionPlan.jacksonMapper.fromJson(executionPlan.testEntryStringList.get(i)));
    }
}
