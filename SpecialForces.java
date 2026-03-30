class SpecialForces extends Soldier {

    String unitName;
    String weaponType;
    boolean airborneQualified;
    int missionsCompleted;
    String specialization;

    void showSpecialForces() {
        showProfile();
        System.out.println("Unit Name: " + unitName);
        System.out.println("Weapon Type: " + weaponType);
        System.out.println("Airborne Qualified: " + airborneQualified);
        System.out.println("Missions Completed: " + missionsCompleted);
        System.out.println("Specialization: " + specialization);
    }
}