package com.lessons.spring;

/**
 * Created by vashishta on 8/18/16.
 */
public class ParentBean {

    private String name;
    private int age;
    private String heritage;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHeritage() {
        return heritage;
    }

    public void setHeritage(String heritage) {
        this.heritage = heritage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
