package com.google.drive.vars;

public class Car {

    private String brand;
    public String model;
    protected String color;
    int year;
    double engineCapacity;
    boolean isEngineStarted = false;

    public void startEngine(){
        isEngineStarted = true;
    }

    public void stopEngine(){
        isEngineStarted = false;
    }

    public boolean isEngineStarted() {
        return isEngineStarted;
    }
}
