package com.study.Test;

public class Factory {
    private static Factory instance;
    private String factoryName;

    private Factory() {}

    public static Factory getInstance() {
        if(instance == null) {
            instance = new Factory();
        }
        return instance;
    }
}
