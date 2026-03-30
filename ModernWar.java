class ModernWar extends War {

    String weaponType;
    int soldiers;
    boolean airSupport;
    String commander;
    String outcome;

    void showModernWarDetails() {
        showWarDetails();
        System.out.println("Weapon Type: " + weaponType);
        System.out.println("Soldiers: " + soldiers);
        System.out.println("Air Support: " + airSupport);
        System.out.println("Commander: " + commander);
        System.out.println("Outcome: " + outcome);
    }
}