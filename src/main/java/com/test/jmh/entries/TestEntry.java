package com.test.jmh.entries;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
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
