package com.yiibai;
import org.testng.annotations.Test;
/**
 * Created by wangzhen on 2019-08-26
 */
public class TestTimeout {

    @Test(timeOut = 5000) // time in mulliseconds
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test(timeOut = 1000)
    public void testThisShouldFail() {
        while (true){
            // do nothing
        }

    }


}
