package com.test.jmh.regex;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.infra.Blackhole;

public class RegexTest {

//    @Benchmark
//    @BenchmarkMode(Mode.Throughput)
//    public void wildCardRegexTest(Blackhole blackhole, ExecutionPlan executionPlan) {
//        for (String email: executionPlan.emailList) {
//            blackhole.consume(executionPlan.wildCardRegexValidator.validate(email));
//        }
//    }

//    @Benchmark
//    @BenchmarkMode(Mode.AverageTime)
//    public void lookBehindEmailRegexTest(Blackhole blackhole, ExecutionPlan executionPlan) {
//        for (String email: executionPlan.emailList) {
//            blackhole.consume(executionPlan.emailRegexLookBehindValidator.validate(email));
//        }
//    }

    @Threads(value = Threads.MAX)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void emailRegexTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        for (String email: executionPlan.emailList) {
            blackhole.consume(executionPlan.emailRegexValidator.validate(email));
        }
    }

    @Threads(value = Threads.MAX)
    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    public void emailRegexTailingTest(Blackhole blackhole, ExecutionPlan executionPlan) {
        for (String email: executionPlan.emailList) {
            blackhole.consume(executionPlan.emailRegexTrailingSpaceValidator.validate(email));
        }
    }
}
