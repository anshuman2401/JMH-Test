package com.test.jmh.regex;

import com.test.jmh.regex.impl.EmailRegexLookBehindValidator;
import com.test.jmh.regex.impl.EmailRegexTrailingSpaceValidator;
import com.test.jmh.regex.impl.EmailRegexValidator;
import com.test.jmh.regex.impl.WildCardRegexValidator;
import com.test.jmh.utils.RandomUtils;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.ArrayList;
import java.util.List;

@State(Scope.Benchmark)
public class ExecutionPlan {

    public WildCardRegexValidator wildCardRegexValidator;
    public EmailRegexLookBehindValidator emailRegexLookBehindValidator;
    public EmailRegexValidator emailRegexValidator;
    public EmailRegexTrailingSpaceValidator emailRegexTrailingSpaceValidator;
    public List<String> emailList;

    @Setup(Level.Invocation)
    public void setUp() {
        wildCardRegexValidator = new WildCardRegexValidator();
        emailRegexLookBehindValidator = new EmailRegexLookBehindValidator();
        emailRegexValidator = new EmailRegexValidator();
        emailRegexTrailingSpaceValidator = new EmailRegexTrailingSpaceValidator();
        emailList = new ArrayList<>();

        for (int i = 0; i < 90; i++) {
            emailList.add(RandomUtils.getRandomEmail());
        }

        for (int i = 0; i < 10; i++) {
            emailList.add(RandomUtils.getRandomInvalidEmail());
        }
    }
}

