package com.test.jmh.redis;

import com.test.jmh.utils.RandomUtils;
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
//    @Threads(4)
//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    public void randomKeyGetLettuceTest(ExecutionPlan executionPlan) {
//        for (String random: executionPlan.randomStringList)
//            executionPlan.lettuce.get(random);
//    }


//    @Threads(4)
//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    public void randomKeyGetRedissonTest(ExecutionPlan executionPlan) {
//        for (String random: executionPlan.randomStringList)
//            executionPlan.redissonClientTest.get(random);
//    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void randomKeyHSetJedisTest(ExecutionPlan executionPlan) {
        TestObject testObject = new TestObject();
        executionPlan.jedis.hset("", testObject.getUidx(), executionPlan.gson.toJson(testObject));
//        executionPlan.jedis.hset(testObject.getUidx(), "amn", testObject.getAmnNickName());
//        executionPlan.jedis.hset(testObject.getUidx(), "firstName", testObject.getFirstName());
//        executionPlan.jedis.hset(testObject.getUidx(), "lastName", testObject.getLastName());
//        executionPlan.jedis.hset(testObject.getUidx(), "amnPhone", testObject.getAlternatePhone());
//        executionPlan.jedis.hset(testObject.getUidx(), "phone", testObject.getPhone());
//        executionPlan.jedis.hset(testObject.getUidx(), "email", testObject.getEmail());
//        executionPlan.jedis.hset(testObject.getUidx(), "normalizedEmail", testObject.getNormalizedEmail());
//        executionPlan.jedis.hset(testObject.getUidx(), "uidx", testObject.getUidx());
    }
}

