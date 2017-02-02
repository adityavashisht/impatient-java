package com.springexample.aware;

import com.com.springexample.beans.ComponentInitializeAware;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by aditya.vashisht on 2/2/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/aware-config.xml"})

public class SpringUnitTest {


    @Autowired
    private ComponentInitializeAware componentInitializeAware;


    @Test
    public void testConfig() {
        componentInitializeAware.invokeMethod();
    }

    @Test
    public void doViaLookup() {
        componentInitializeAware.doViaLookup();
    }

}
