package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 在我们期望结果为某个异常时
     * 比如：传入非法参数，程序跑出异常，这是我们的期望结果
     */

    //这是一个测试结果会成功的异常测试

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptedtionSuccess(){
        System.out.println("这是一个失败的异常测试");
        throw new RuntimeException();
    }
}
