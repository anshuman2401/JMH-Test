package com.test.jmh.entries;

import lombok.Data;

@Data
public class TestDaoEntity {
    private String firstName;
    private String lastName;
    private int age;
    private Integer value;
    private Long lastModifiedOn;
    private boolean allow;
    private Boolean health;
}
