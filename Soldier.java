class Soldier {

    String name;
    String rank;
    int serviceYears;

    void reportDuty() {
        System.out.println("Reporting for duty");
    }

    void standDown() {
        System.out.println("Standing down");
    }

    void showProfile() {
        System.out.println("Name: " + name);
        System.out.println("Rank: " + rank);
        System.out.println("Service Years: " + serviceYears);
    }
}