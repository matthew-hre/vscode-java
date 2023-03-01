package com.matt.cool.test;

import org.junit.jupiter.api.*;

import com.matt.cool.MyClass; 

public class Tests {
    private MyClass myClass = new MyClass("Matt");

    @Test
    public void test() {
        Assertions.assertEquals("Matt", myClass.getName());
    }
}
