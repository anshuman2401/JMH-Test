package com.test.jmh.redis;

import com.google.gson.Gson;
import com.test.jmh.redis.clients.Jedis;
import com.test.jmh.utils.FileUtils;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import java.util.List;

@State(Scope.Benchmark)
public class KeyExecutionPlan {
    public Jedis jedis;
//    public Lettuce lettuce;
    public Gson gson;
    public List<String> randomStringList;
    int index = 0;

    @Setup(Level.Trial)
    public void setUp() {
        jedis = new Jedis();
//        lettuce = new Lettuce();
        gson = new Gson();
        randomStringList = FileUtils.fileToList("/home/myntra/randomString.txt");
    }
}
