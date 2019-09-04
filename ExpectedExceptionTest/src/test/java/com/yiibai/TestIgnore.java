package com.yiibai;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by wangzhen on 2019-08-26
 */
public class TestIgnore {
    @Test // default enable=true
    public void test1() {
        Assert.assertEquals(true, true);
    }

    @Test(enabled = true)
    public void test2() {
        Assert.assertEquals(true, true);
    }

    @Test(enabled = false)
    public void test3() {
        Assert.assertEquals(true, true);


    }
}
