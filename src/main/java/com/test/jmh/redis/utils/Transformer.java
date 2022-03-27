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
//        entry.setPidx(UUID.randomUUID().toString());
        entry.setName("Anshuman Kaushik");
        entry.setDefaultProfile(true);
        entry.setImage("http://assets.myntassets.com/assets/images/2021/5/12/49d1f015-5e87-4650-b30a-4f638461cfe21620808191515-temp_photo.jpg");
        return entry;
    }

    public static Map<String, String> createRandomProfileMap() {
        Map<String, String> entry = new HashMap<>();
        entry.put("name", "Anshuman");
        entry.put("defaultProfile", "true");
        entry.put("image", "http://assets.myntassets.com/assets/images/2021/5/12/49d1f015-5e87-4650-b30a-4f638461cfe21620808191515-temp_photo.jpg");
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
