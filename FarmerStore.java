class FarmerStore {

    Farmer[] farmers = new Farmer[10];
    int index = 0;

    void save(Farmer farmer) {

        if (farmer != null) {

            if (index < farmers.length) {

                farmers[index] = farmer;

                System.out.print("Farmer added at " + index + " -> ");
                farmer.displayDetails();
                System.out.println("------------------------------");

                index++;

            } else {
                System.out.println("Farmer list is full");
            }

        } else {
            System.out.println("Invalid farmer");
        }
    }
}