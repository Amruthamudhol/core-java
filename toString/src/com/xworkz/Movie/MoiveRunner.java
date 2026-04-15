package com.xworkz.Movie;

public class MoiveRunner {
    public static void main(String[] args) {

        Producer p1 = new Producer("Karan Johar", 500.0);

        String[] artists = {"ActorA", "ActorB"};

        Movie mov1 = new Movie("Dream Project", 100000000L, 8.2f,
                'U', artists, FilmCategory.ROMANCE, p1);

        TheatreMovie mov2 = new TheatreMovie("SciFi Blast", 200000000L, 9.0f,
                'A', artists, FilmCategory.SCI_FI, p1, 500, true);

        mov1.startShow();
        mov1.displayCollection();
        System.out.println(mov1);

        System.out.println("----------------------");

        mov2.startShow();
        mov2.displayCollection();
        System.out.println(mov2);
    }
}
