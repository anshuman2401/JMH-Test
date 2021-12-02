package com.test.jmh.redis;

import com.test.jmh.redis.clients.Jedis;
import com.test.jmh.redis.clients.Lettuce;
import com.test.jmh.utils.RandomUtils;
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
    public List<String> randomStringList;

    @Setup(Level.Trial)
    public void setUp() {
        jedis = new Jedis();
        lettuce = new Lettuce();
        randomStringList = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            String random = RandomUtils.getRandomString();
            randomStringList.add(random);
            jedis.set(random, RandomUtils.getRandomString());
        }
    }
}
