class Therapist {

    String therapistName;
    int experience;

    Therapist(String therapistName, int experience) {
        this.therapistName = therapistName;
        this.experience = experience;
    }

    void printDetails() {
        System.out.println("Therapist Name: " + therapistName);
        System.out.println("Experience: " + experience);
    }
}