package com.test.jmh.redis.clients;

import com.test.jmh.redis.RedisFactory;
import io.lettuce.core.cluster.RedisClusterClient;
import io.lettuce.core.cluster.api.StatefulRedisClusterConnection;
import io.lettuce.core.cluster.api.sync.RedisAdvancedClusterCommands;
import io.lettuce.core.codec.ByteArrayCodec;
import io.lettuce.core.codec.RedisCodec;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class Lettuce implements RedisFactory<String, Object> {

    private static StatefulRedisClusterConnection<String, Object> cluster = null;

    public Lettuce () {
        try {
            RedisClusterClient redisClient = RedisClusterClient.create("redis://10.162.186.40:7001");
            cluster = redisClient.connect(
                    new RedisCodec<String, Object>() {
                              private final ByteArrayCodec byteArrayCodec = new ByteArrayCodec();

                              @Override
                              public String decodeKey(ByteBuffer byteBuffer) {
                                  return Charset.defaultCharset().decode(byteBuffer).toString();
                              }

                              @Override
                              public Object decodeValue(ByteBuffer bytes) {
                                  try (ObjectInputStream is = new ObjectInputStream(new ByteArrayInputStream(byteArrayCodec.decodeValue(bytes)))) {
                                      return is.readObject();
                                  } catch (Exception e) {
                                      throw new IllegalArgumentException(e);
                                  }
                              }

                              @Override
                              public ByteBuffer encodeKey(String s) {
                                  return Charset.defaultCharset().encode(s);
                              }

                              @Override
                              public ByteBuffer encodeValue(Object o) {
                                  try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
                                       ObjectOutputStream os = new ObjectOutputStream(bos)) {
                                      os.writeObject(o);
                                      return byteArrayCodec.encodeValue(bos.toByteArray());
                                  } catch (Exception e) {
                                      throw new IllegalArgumentException(e);
                                  }
                          }
                      }
                );
        }catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }

    public static RedisAdvancedClusterCommands<String, Object> getCluster() {
        return cluster.sync();
    }

    @Override
    public void set(String key, Object value) {
        getCluster().set(key, value);
    }

    @Override
    public Object get(String key) {
        return getCluster().get(key);
    }
}
