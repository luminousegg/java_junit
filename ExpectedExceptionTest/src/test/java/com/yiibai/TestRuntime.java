package com.yiibai;
import org.testng.annotations.Test;
/**
 * Created by wangzhen on 2019-08-26
 */
public class TestRuntime {
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :"+ i);
    }


}
