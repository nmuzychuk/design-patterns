package com.nmuzychuk;

import java.util.HashMap;

public final class FlyweightCompany {
    private FlyweightCompany() {
    }

    private static HashMap<String, Programmer> programmers = new HashMap<>();

    public static synchronized Programmer getProgrammer(final String type) {
        Programmer programmer = programmers.get(type);

        if (programmer == null) {
            switch (type) {
                case "C":
                    programmer = new CProgrammer();
                    break;
                case "Java":
                    programmer = new JavaProgrammer();
                    break;
                case "Web":
                    programmer = new WebProgrammer();
                    break;
                default:
                    throw new RuntimeException("No such programmer");
            }
            programmers.put(type, programmer);
        }
        return programmer;
    }
}
