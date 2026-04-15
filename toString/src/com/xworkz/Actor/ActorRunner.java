package com.xworkz.Actor;

public class ActorRunner {
    public static void main(String[] args) {

        Agency a1 = new Agency("TalentHub", "Banglore");

        String[] movies = {"Movie1", "Movie2"};

        Actor ac1 = new Actor("Sudeep", 20, 2000000,
                movies, SkillLevel.PROFESSIONAL, a1);

        LeadActor ac2 = new LeadActor("Yash", 10, 5000000,
                movies, SkillLevel.LEGEND, a1,
                10, true);

        ac1.perform();
        ac1.showSalary();
        System.out.println(ac1);

        System.out.println("----------------------");

        ac2.perform();
        ac2.showSalary();
        System.out.println(ac2);
    }

}
