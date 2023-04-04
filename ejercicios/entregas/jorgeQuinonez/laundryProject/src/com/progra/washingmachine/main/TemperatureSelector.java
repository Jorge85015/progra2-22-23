package com.progra.washingmachine.main;

public class TemperatureSelector {

    private int temperature;
    private final int maxTemperature = 90;

    public TemperatureSelector() {
        temperature = 0;
    }

    public void setTemperature(int temp) {
        if ((temp >= 0) && (temp <= maxTemperature))
            temperature = temp;
        else
            System.err.println("Error: Temperatura incorrecta");
    }

    public int temperature() {
        return (temperature);
    }

    public int maxTemperature() {
        return (maxTemperature);
    }

    public int electricalConsumption() {
        return (temperature * 30 / 100);
    }

}
