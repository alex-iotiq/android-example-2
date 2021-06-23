package com.example.android_example;

import org.junit.Test;

import org.junit.Assert;

public class ExampleUnitTest {
    @Test
    public void test_TestMe(){
        Assert.assertNotNull(new TestMe().test());
    }

    @Test
    public void test_TestString(){
        Assert.assertEquals("abc", new TestMe().testString("abc"));
    }

    @Test
    public void test_TestMeCaller(){
        Assert.assertNotNull(new TestMeCaller().callTest());
    }

    @Test
    public void test_TestMeCallerString(){
        Assert.assertEquals("abc", new TestMeCaller().callTestString("abc"));
    }
}
