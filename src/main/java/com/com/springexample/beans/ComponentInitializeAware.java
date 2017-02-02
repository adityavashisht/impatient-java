package com.com.springexample.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

/**
 * Created by aditya.vashisht on 2/2/17.
 */
@Component
public class ComponentInitializeAware implements InitializingBean, ApplicationContextAware {

    // Dependencies that spring will inject
    private ApplicationContext applicationContext;

    @Autowired
    private Dependency dependency;



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }


    // Behavior of this component
    public void invokeMethod() {
        dependency.doNothing();
    }

    public void doViaLookup() {
        DependencyLookup lookedUp = (DependencyLookup) applicationContext.getBean("dependencyLookup");
        lookedUp.lookUp();
    }


    // Hooks - lifecycle
    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(dependency);
        System.out.println("I was created and validaed via initializing bean");
    }

    @PostConstruct
    public void init() {
        System.out.println("I was called via post construct");
    }


}
