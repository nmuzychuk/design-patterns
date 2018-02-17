package com.nmuzychuk;

public class CelsiusReporterImpl implements CelsiusReporter {
    private int temperature;

    @Override
    public int getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(final int celsius) {
        this.temperature = celsius;
    }
}
