package tests;

import data.Data;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import pages.Page;

public class Test extends Data {
    @Before
    public void setUP() {
        beforeMethod();
        driver.get("https://www.staff.am/");

    }

    @org.junit.Test
    public void verify_header_text(){
        Page log = new Page();
        Assert.assertEquals("CAREER SEARCH STARTS HERE", log.header_text());


    }

    @After
    public void tearDown() throws InterruptedException {
        getWaitTime2();
        driver.quit();
    }
}
