package com.course.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {

    @Test
    public void testCase1(){

        System.out.println("这是测试用例1");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void testCase2(){

        System.out.println("这是测试用例2");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法前运行的");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法后运行的");
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
