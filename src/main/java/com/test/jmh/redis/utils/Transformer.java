package com.test.jmh.redis.utils;

import com.google.gson.Gson;
import com.test.jmh.redis.entry.ProfileEntry;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Transformer {

    private final static Gson gson = new Gson();

    public static ProfileEntry createRandomProfile() {
        ProfileEntry entry = new ProfileEntry();
        entry.setUidx(UUID.randomUUID().toString());
        entry.setPidx(UUID.randomUUID().toString());
        entry.setName("Anshuman");
        entry.setDefaultProfile(true);
        entry.setImage("some url which is long one because it is a image url");
        return entry;
    }

    public static Map<String, String> createRandomProfileMap() {
        Map<String, String> entry = new HashMap<>();
        entry.put("uidx", UUID.randomUUID().toString());
        entry.put("pidx", UUID.randomUUID().toString());
        entry.put("name", "Anshuman");
        entry.put("defaultProfile", "true");
        entry.put("image", "some url which is long one because it is a image url");
        return entry;
    }

    public static Map<String, String> createRandomListOfProfileMap() {
        Map<String, String> entry = new HashMap<>();
        entry.put(UUID.randomUUID().toString(), gson.toJson(createRandomProfile()));
        entry.put(UUID.randomUUID().toString(), gson.toJson(createRandomProfile()));
//        entry.put(UUID.randomUUID().toString(), gson.toJson(createRandomProfile()));
//        entry.put(UUID.randomUUID().toString(), gson.toJson(createRandomProfile()));
//        entry.put(UUID.randomUUID().toString(), gson.toJson(createRandomProfile()));
        return entry;
    }
}
