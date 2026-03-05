class Coach {

    String name;
    int experience;
    double salary;
    boolean internationalCoach;
    String sport;

    Team team;
    Stadium stadium;
    Certificate certificate;
    Contract contract;
    Equipment equipment;

    Coach(String name, int experience, double salary, boolean internationalCoach, String sport,
          Team team, Stadium stadium, Certificate certificate, Contract contract, Equipment equipment) {

        this.name = name;
        this.experience = experience;
        this.salary = salary;
        this.internationalCoach = internationalCoach;
        this.sport = sport;

        this.team = team;
        this.stadium = stadium;
        this.certificate = certificate;
        this.contract = contract;
        this.equipment = equipment;
    }
}