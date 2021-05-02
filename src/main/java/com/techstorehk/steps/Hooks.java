package com.techstorehk.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.techstorehk.utils.DriverManager.initDriver;
import static com.techstorehk.utils.DriverManager.quit;

public class Hooks {

    @Before
    public void beforeSuitMethod() {
        initDriver();
    }

    @After
    public void cleanUp() {
        quit();
    }
}
