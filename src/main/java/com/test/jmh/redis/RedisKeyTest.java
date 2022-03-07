package com.test.jmh.redis;

import com.test.jmh.redis.utils.Transformer;
import com.test.jmh.utils.RandomUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Threads;

public class RedisKeyTest {


    // key as profile:uidx and value as profile object (Jedis client)
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @Threads(Threads.MAX)
//    public void keyAsPrefixAndUidxJedisTest(KeyExecutionPlan executionPlan) {
//        executionPlan.jedis.set(RandomUtils.getRandomString(43), executionPlan.gson.toJson(Transformer.createRandomProfile()));
//    }

//    // key as profile:uidx and value as profile object (Jedis client)
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @Threads(Threads.MAX)
//    public void keyAsPrefixAndUidxLettuceTest(KeyExecutionPlan executionPlan) {
//        for (String key : executionPlan.randomStringList)
//            executionPlan.lettuce.set(key, executionPlan.gson.toJson(Transformer.createRandomProfile()));
//    }
//
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @Threads(Threads.MAX)
    public void keyAsPrefixAndUidxAndValueAsHashJedisTest(KeyExecutionPlan executionPlan) {
        executionPlan.jedis.hset(RandomUtils.getRandomString(43), Transformer.createRandomListOfProfileMap());
    }

//    // key as profile:uidx and value as profile object (Jedis client)
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @Threads(Threads.MAX)
//    public void keyAsPrefixAndUidxAndValueAsHashLettuceTest(KeyExecutionPlan executionPlan) {
//        for (String key : executionPlan.randomStringList)
//            executionPlan.lettuce.set(key, executionPlan.gson.toJson(Transformer.createRandomProfile()));
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @Threads(Threads.MAX)
//    public void keyAsPrefixAndUidxAndPidxJedisTest(KeyExecutionPlan executionPlan) {
//        for (String key : executionPlan.randomStringList)
//            executionPlan.jedis.set(key, executionPlan.gson.toJson(Transformer.createRandomProfile()));
//    }
//
//    // key as profile:uidx and value as profile object (Jedis client)
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @Threads(Threads.MAX)
//    public void keyAsPrefixAndUidxAndPidxLettuceTest(KeyExecutionPlan executionPlan) {
//        for (String key : executionPlan.randomStringList)
//            executionPlan.lettuce.set(key, executionPlan.gson.toJson(Transformer.createRandomProfile()));
//    }
//
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @Threads(Threads.MAX)
//    public void keyAsPrefixAndUidxAndPidxAndValueAsHashJedisTest(KeyExecutionPlan executionPlan) {
//        for (String key : executionPlan.randomStringList)
//            executionPlan.jedis.set(key, executionPlan.gson.toJson(Transformer.createRandomProfile()));
//    }
//
//    // key as profile:uidx and value as profile object (Jedis client)
//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    @Threads(Threads.MAX)
//    public void keyAsPrefixAndUidxAndPidxAndValueAsHashLettuceTest(KeyExecutionPlan executionPlan) {
//        for (String key : executionPlan.randomStringList)
//            executionPlan.lettuce.set(key, executionPlan.gson.toJson(Transformer.createRandomProfile()));
//    }
}

