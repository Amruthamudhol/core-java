class Trainer {

    String trainerName;
    int experience;

    Trainer(String trainerName, int experience) {
        this.trainerName = trainerName;
        this.experience = experience;
    }

    void getInfo() {
        System.out.println("Trainer Details:");
        System.out.println("Trainer Name: " + this.trainerName);
        System.out.println("Experience: " + this.experience + " years");
    }
}