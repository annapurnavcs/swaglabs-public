package com.swaglabs.hooks;

import com.swaglabs.utils.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;



/**
 * Hooks class containing common setup and teardown methods
 */
public class Hooks {

    @Before
    public void setup() throws InterruptedException {
        Driver.initializeDriver();
    }

    @After
    public void destroy() throws InterruptedException {
        Driver.closeDriver();
    }
} 