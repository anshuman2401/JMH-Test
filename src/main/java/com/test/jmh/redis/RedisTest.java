package com.test.jmh.redis;

import com.test.jmh.utils.RandomUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;

public class RedisTest {

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void randomKeySetJedisTest(ExecutionPlan executionPlan) {
        executionPlan.jedis.set(RandomUtils.getRandomString(), RandomUtils.getRandomString());
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void randomKeySetLettuceTest(ExecutionPlan executionPlan) {
        executionPlan.lettuce.set(RandomUtils.getRandomString(), RandomUtils.getRandomString());
    }
}

