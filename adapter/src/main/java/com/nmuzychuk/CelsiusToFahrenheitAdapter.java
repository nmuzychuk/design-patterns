package com.nmuzychuk;

public class CelsiusToFahrenheitAdapter implements FahrenheitReporter {

    private CelsiusReporterImpl celsiusReporter = new CelsiusReporterImpl();

    @Override
    public int getTemperature() {
        return celsiusToFahrenheit(celsiusReporter.getTemperature());
    }

    @Override
    public void setTemperature(final int fahrenheit) {
        celsiusReporter.setTemperature(fahrenheitToCelsius(fahrenheit));
    }

    private int celsiusToFahrenheit(final int celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private int fahrenheitToCelsius(final int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
