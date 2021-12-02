package com.test.jmh.redis;

import com.test.jmh.utils.RandomUtils;
import lombok.Data;

import java.math.BigInteger;

@Data
public class TestObject {
    private BigInteger id;
    private String uidx = RandomUtils.getRandomString();
    private String firstName = RandomUtils.getRandomString();
    private String lastName = RandomUtils.getRandomString();
    private Gender gender = Gender.MALE;
    private Long dob = System.currentTimeMillis();
    private String bio = RandomUtils.getRandomString();
    private String email = RandomUtils.getRandomEmail();
    private String normalizedEmail = RandomUtils.getRandomEmail();
    private Boolean emailVerified = false;
    private String isdCode;
    private String phone = RandomUtils.getRandomString();
    private Boolean phoneVerified = true;
    private UserStatus status = UserStatus.INACTIVE;
    private UserType userType = UserType.REGULAR;
    private RegistrationChannel channel = RegistrationChannel.EMAIL;
    private String amnIsdCode;
    private String alternatePhone = RandomUtils.getRandomString();
    private String amnNickName = RandomUtils.getRandomString();
    private String extraData;
    private String location;
    private String publicProfileId;
    private Long phoneVerifiedOn = System.currentTimeMillis();
    private Long emailVerifiedOn = System.currentTimeMillis();
    private Long registrationOn = System.currentTimeMillis();
}

enum UserStatus {
    INACTIVE
}

enum UserType {
    REGULAR
}

enum RegistrationChannel {
    EMAIL
}

enum Gender {
    MALE
}
