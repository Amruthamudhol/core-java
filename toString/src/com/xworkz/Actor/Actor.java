package com.xworkz.Actor;

public class Actor {
    String actorName;
    int experienceYears;
    double salary;
    String[] knownMovies;
    SkillLevel level;
    Agency management;

    Actor(String actorName, int experienceYears, double salary,
          String[] knownMovies, SkillLevel level, Agency management) {

        this.actorName = actorName;
        this.experienceYears = experienceYears;
        this.salary = salary;
        this.knownMovies = knownMovies;
        this.level = level;
        this.management = management;
    }

    public void perform() {
        System.out.println(actorName + " is acting in a movie.");
    }


    public void showSalary() {
        System.out.println("Salary: " + salary);
    }

    @Override
    public String toString() {
        return "Actor [actorName=" + actorName +
                ", experienceYears=" + experienceYears +
                ", salary=" + salary +
                ", level=" + level +
                ", management=" + management + "]";
    }
}
