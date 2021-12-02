package com.test.jmh.redis;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Threads;

public class RedisTest {

//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    public void randomKeySetJedisTest(ExecutionPlan executionPlan) {
//        executionPlan.jedis.set(RandomUtils.getRandomString(), RandomUtils.getRandomString());
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    public void randomKeySetLettuceTest(ExecutionPlan executionPlan) {
//        executionPlan.lettuce.set(RandomUtils.getRandomString(), RandomUtils.getRandomString());
//    }

//    @Threads(4)
//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    public void randomKeyGetJedisTest(ExecutionPlan executionPlan) {
//        for (String random: executionPlan.randomStringList)
//            executionPlan.jedis.get(random);
//    }
//
    @Threads(4)
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void randomKeyGetLettuceTest(ExecutionPlan executionPlan) {
        for (String random: executionPlan.randomStringList)
            executionPlan.lettuce.get(random);
    }


//    @Threads(4)
//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    public void randomKeyGetRedissonTest(ExecutionPlan executionPlan) {
//        for (String random: executionPlan.randomStringList)
//            executionPlan.redissonClientTest.get(random);
//    }
}

