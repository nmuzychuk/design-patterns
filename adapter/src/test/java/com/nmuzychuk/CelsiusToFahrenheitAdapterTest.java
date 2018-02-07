package com.nmuzychuk;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class CelsiusToFahrenheitAdapterTest {

    @Test
    public void testAdapter() throws Exception {
        CelsiusToFahrenheitAdapter adapter = new CelsiusToFahrenheitAdapter();

        Field celsiusReporterField = adapter.getClass().getDeclaredField("celsiusReporter");
        celsiusReporterField.setAccessible(true);
        CelsiusReporter celsiusReporter = (CelsiusReporterImpl) celsiusReporterField.get(adapter);
        Field temperatureField = celsiusReporter.getClass().getDeclaredField("temperature");
        temperatureField.setAccessible(true);

        assertEquals(32, adapter.getTemperature());
        assertEquals(0, temperatureField.getInt(celsiusReporter));

        adapter.setTemperature(68);

        assertEquals(68, adapter.getTemperature());
        assertEquals(20, temperatureField.getInt(celsiusReporter));

    }

}
