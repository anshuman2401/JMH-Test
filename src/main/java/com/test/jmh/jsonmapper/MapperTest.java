package com.test.jmh.jsonmapper;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

public class MapperTest {

//    @Benchmark
//    @Fork(value = 1, warmups = 1)
//    @Warmup(iterations = 1)
//    @BenchmarkMode(Mode.Throughput)
//    public void blankMapperToJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) {
//        blackhole.consume(executionPlan.blankMapper.toJson(executionPlan.testEntryString));
//    }

//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    public void gsonMapperToJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) {
//        for (int i =0 ; i < executionPlan.iterations; i++)
//            blackhole.consume(executionPlan.gsonMapper.toJson(executionPlan.testEntryString));
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    public void jacksonMapperToJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) throws Exception {
//        for (int i =0 ; i < executionPlan.iterations; i++)
//            blackhole.consume(executionPlan.jacksonMapper.toJson(executionPlan.testEntryJacksonString));
//    }
//
//    @Benchmark
//    @Fork(value = 1, warmups = 1)
//    @Warmup(iterations = 1)
//    @BenchmarkMode(Mode.Throughput)
//    public void blankMapperFromJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) {
//        blackhole.consume(executionPlan.blankMapper.fromJson(executionPlan.testEntry));
//    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void gsonMapperFromJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        blackhole.consume(executionPlan.gsonMapper.fromJson(executionPlan.testEntry));
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void jacksonMapperFromJsonTest(Blackhole blackhole, ExecutionPlan executionPlan) throws Exception{
        blackhole.consume(executionPlan.jacksonMapper.fromJson(executionPlan.testEntry));
    }
}
