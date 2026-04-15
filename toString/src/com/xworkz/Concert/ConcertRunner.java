package com.xworkz.Concert;

public class ConcertRunner {
    public static void main(String[] args) {

        Organizer o1 = new Organizer("MusicFest", "Delhi");

        String[] artists = {"Singer1", "Singer2"};

        Concert c1 = new Concert("Summer Beats", 120, artists, ConcertType.BAND, o1);

        LiveConcert c2 = new LiveConcert("Rock Night", 180, artists, ConcertType.FESTIVAL, o1,
                true, 1500);

        c1.startEvent();
        c1.showDuration();
        System.out.println(c1);

        System.out.println("----------------------");

        c2.startEvent();
        c2.showDuration();
        System.out.println(c2);
    }
}
