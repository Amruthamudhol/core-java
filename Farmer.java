class Farmer {

    String name;
    int experience;
    String crop;
	String village;
	double landSize;

    Farmer(String name, int experience, String crop,String village, double landSize) {
        this.name = name;
        this.village = village;
        this.crop = crop;
        this.landSize = landSize;
        this.experience = experience;
    }

    void displayDetails() {
        System.out.println("Name: " + name +
                           ", Village: " + village +
                           ", Crop: " + crop +
                           ", Land Size: " + landSize +
                           ", Experience: " + experience);
    }
}