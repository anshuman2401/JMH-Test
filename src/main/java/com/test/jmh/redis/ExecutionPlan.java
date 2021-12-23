package com.test.jmh.redis;

import com.google.gson.Gson;
import com.test.jmh.redis.clients.Jedis;
import com.test.jmh.redis.clients.Lettuce;
import com.test.jmh.redis.clients.RedissonClientTest;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.ArrayList;
import java.util.List;

@State(Scope.Benchmark)
public class ExecutionPlan {

    public Jedis jedis;
    public Gson gson;
//    public Lettuce lettuce;
//    public RedissonClientTest redissonClientTest;
    public List<String> randomStringList;

    @Setup(Level.Trial)
    public void setUp() {
        jedis = new Jedis();
        gson = new Gson();
//        lettuce = new Lettuce();
//        redissonClientTest = new RedissonClientTest();
    }
}
