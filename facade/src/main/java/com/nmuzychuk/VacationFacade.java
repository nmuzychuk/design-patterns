package com.nmuzychuk;

public final class VacationFacade {
    private static Boss boss = new Boss();
    private static TravelAgent travelAgent = new TravelAgent();
    private static Assistant assistant = new Assistant();

    private VacationFacade() {
    }

    public static void prepareVacation() {
        boss.requestVacation();
        travelAgent.bookHotel();
        assistant.bookFlight();
    }
}
