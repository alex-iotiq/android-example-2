package com.example.android_example;

public class TestMe {
    // will always return 1
    public int test(){
        int tmp = 2;
        for (int i = 0; i < 90000000; i++) {
        // for (int i = 0; i < 90; i++) {
            tmp += i^i;
        }
        return tmp;
    }
}