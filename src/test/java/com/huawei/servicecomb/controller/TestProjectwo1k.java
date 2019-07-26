package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectwo1k {

        Projectwo1kDelegate projectwo1kDelegate = new Projectwo1kDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectwo1kDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}