package com.example.android_example;

public class TestMeCaller {

    public int callTest(){
        return new TestMe().test();
    }
    public String callTestString(String s){
        return new TestMe().testString(s);
    }
}