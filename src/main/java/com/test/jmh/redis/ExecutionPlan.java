package com.test.jmh.redis;

import com.test.jmh.redis.clients.Jedis;
import com.test.jmh.redis.clients.Lettuce;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ExecutionPlan {

    public Jedis jedis;
//    public Lettuce lettuce;

    @Setup(Level.Trial)
    public void setUp() {
        jedis = new Jedis();
//        lettuce = new Lettuce();
    }
}
