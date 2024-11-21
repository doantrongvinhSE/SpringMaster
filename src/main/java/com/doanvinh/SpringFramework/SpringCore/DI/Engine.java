package com.doanvinh.SpringFramework.SpringCore.DI;



public class Engine {
    private String nameEngine;
    private double speedEngine;


    public Engine() {
    }

    public Engine(String nameEngine, double speedEngine) {
        this.nameEngine = nameEngine;
        this.speedEngine = speedEngine;
    }

    public String getNameEngine() {
        return nameEngine;
    }

    public void setNameEngine(String nameEngine) {
        this.nameEngine = nameEngine;
    }

    public double getSpeedEngine() {
        return speedEngine;
    }

    public void setSpeedEngine(double speedEngine) {
        this.speedEngine = speedEngine;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "nameEngine='" + nameEngine + '\'' +
                ", speedEngine=" + speedEngine +
                '}';
    }
}
