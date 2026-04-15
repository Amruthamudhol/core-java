package com.xworkz.Concert;

public class LiveConcert extends Concert{
    boolean isOutdoor;
    int ticketPrice;

    LiveConcert(String eventName, int duration, String[] artistList,
                ConcertType type, Organizer organizer,
                boolean isOutdoor, int ticketPrice) {

        super(eventName, duration, artistList, type, organizer);
        this.isOutdoor = isOutdoor;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void startEvent() {
        System.out.println("Live concert is now starting: " + eventName);
    }

    @Override
    public void showDuration() {
        System.out.println("Enjoy the live concert for " + duration + " minutes!");
    }

    @Override
    public String toString() {
        return "LiveConcert [eventName=" + eventName +
                ", duration=" + duration +
                ", type=" + type +
                ", organizer=" + organizer +
                ", isOutdoor=" + isOutdoor +
                ", ticketPrice=" + ticketPrice + "]";
    }
}
