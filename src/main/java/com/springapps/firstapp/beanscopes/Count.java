package com.springapps.firstapp.beanscopes;

public class Count {
    private Integer counter;
    private static Count instance;

    private Count(int i) {
    }

    public static Count getInstance() {
        if (instance == null) {
            instance = new Count(0);
        }
        return instance;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public void increment() {
        counter++;
    }
}