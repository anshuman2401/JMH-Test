package com.test.jmh;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        args = new String[1];
        args[0] = "com.test.jmh.regex.RegexTest";
        org.openjdk.jmh.Main.main(args);
    }
}
