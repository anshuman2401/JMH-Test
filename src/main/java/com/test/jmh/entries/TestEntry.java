package com.test.jmh.entries;

import lombok.Data;
import java.util.Date;

@Data
public class TestEntry {
    private String firstName;
    private String lastName;
    private int age;
    private Integer value;
    private Date dob;
    private Long lastModifiedOn;
    private boolean allow;
    private Boolean health;
}
