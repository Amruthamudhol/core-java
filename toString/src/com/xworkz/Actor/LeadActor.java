package com.xworkz.Actor;

public class LeadActor extends Actor{
    int awardCount;
    boolean panIndiaStar;

    LeadActor(String actorName, int experienceYears, double salary,
              String[] knownMovies, SkillLevel level,
              Agency management, int awardCount, boolean panIndiaStar) {

        super(actorName, experienceYears, salary, knownMovies, level, management);
        this.awardCount = awardCount;
        this.panIndiaStar = panIndiaStar;
    }

    @Override
    public void perform() {
        System.out.println(actorName + " is performing as a lead actor.");
    }

    @Override
    public void showSalary() {
        System.out.println("Lead Actor Salary: " + salary);
    }

    @Override
    public String toString() {
        return "LeadActor [actorName=" + actorName +
                ", experienceYears=" + experienceYears +
                ", salary=" + salary +
                ", level=" + level +
                ", management=" + management +
                ", awardCount=" + awardCount +
                ", panIndiaStar=" + panIndiaStar + "]";
    }
}
