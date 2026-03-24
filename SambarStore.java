class SambarStore {

    Sambar[] sambars = new Sambar[10];
    int index = 0;

    void save(Sambar sambar) {

        if (sambar != null) {

            if (index < sambars.length) {

                sambars[index] = sambar;

                System.out.print("Sambar stored at " + index + " -> ");
                sambar.displayInfo();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

                index++;

            } else {
                System.out.println("No space for more sambar items");
            }

        } else {
            System.out.println("Sambar object is null");
        }
    }
}