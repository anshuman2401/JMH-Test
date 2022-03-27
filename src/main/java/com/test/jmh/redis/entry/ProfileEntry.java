package com.test.jmh.redis.entry;

import lombok.Data;

@Data
public class ProfileEntry {
    private String pidx;
    private String name;
    private String image;
    private boolean defaultProfile;
}
