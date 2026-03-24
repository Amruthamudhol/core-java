class TollgateStore {

    Tollgate[] tollgates = new Tollgate[10];
    int index = 0;

    void save(Tollgate tollgate) {

        if (tollgate != null) {

            if (index < tollgates.length) {

                tollgates[index] = tollgate;

                System.out.print("Saved successfully at position " + index + " -> ");
                tollgate.printInfo();
                System.out.println("=================================");

                index++;

            } else {
                System.out.println("No more space to store tollgates");
            }

        } else {
            System.out.println("Invalid tollgate object");
        }
    }
}