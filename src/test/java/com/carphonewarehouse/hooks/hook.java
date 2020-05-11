package com.carphonewarehouse.hooks;

import com.carphonewarehouse.common.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hook extends Browsers {

    @Before
    public void setup(){
        launchBrowser("Chrome");
    }

    @After

    public void tearDown(){
        closeBrowser();
    }
}
