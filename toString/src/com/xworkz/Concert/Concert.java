package com.xworkz.Concert;

public class Concert {
    String eventName;
    int duration;
    String[] artistList;
    ConcertType type;
    Organizer organizer;

    Concert(String eventName, int duration, String[] artistList,
            ConcertType type, Organizer organizer) {

        this.eventName = eventName;
        this.duration = duration;
        this.artistList = artistList;
        this.type = type;
        this.organizer = organizer;
    }

    public void startEvent() {
        System.out.println("Concert started: " + eventName);
    }

    public void showDuration() {
        System.out.println("Duration: " + duration + " mins");
    }

    @Override
    public String toString() {
        return "Concert [eventName=" + eventName +
                ", duration=" + duration +
                ", type=" + type +
                ", organizer=" + organizer + "]";
    }
}
