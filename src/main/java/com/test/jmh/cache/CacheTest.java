package com.test.jmh.cache;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

public class CacheTest {

    @Threads(4)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void guavaBigCacheTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        for (int i =0 ; i < executionPlan.iterations; i++)
            blackhole.consume(executionPlan.guavaCache.get(executionPlan.bigCacheKey));
    }

    @Threads(4)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void guavaSmallCacheTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        for (int i =0 ; i < executionPlan.iterations; i++)
            blackhole.consume(executionPlan.guavaCache.get(executionPlan.smallCacheKey));
    }
}
