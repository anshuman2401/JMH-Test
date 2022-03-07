package com.test.jmh.redis.utils;

import com.test.jmh.redis.entry.ProfileEntry;

import java.util.UUID;

public class Transformer {

    public static ProfileEntry createRandomProfile() {
        ProfileEntry entry = new ProfileEntry();
        entry.setUidx(UUID.randomUUID().toString());
        entry.setPidx(UUID.randomUUID().toString());
        entry.setName("Anshuman");
        entry.setDefaultProfile(true);
        entry.setImage("some url which is long one because it is a image url");
        return entry;
    }
}
