package com.test.jmh.redis;

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
    public Lettuce lettuce;
//    public RedissonClientTest redissonClientTest;
    public List<String> randomStringList;

    @Setup(Level.Trial)
    public void setUp() {
        jedis = new Jedis();
        lettuce = new Lettuce();
//        redissonClientTest = new RedissonClientTest();
        randomStringList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            TestObject testObject = new TestObject();
            randomStringList.add(testObject.getUidx());
            lettuce.set(testObject.getUidx(), testObject);
        }
    }
}
