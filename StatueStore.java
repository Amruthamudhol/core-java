class StatueStore {

    Statue[] statues = new Statue[10];
    int index = 0;

    void save(Statue statue) {

        if (statue != null) {

            if (index < statues.length) {

                statues[index] = statue;

                System.out.println("Statue added at index " + index);
                statue.printInfo();
                System.out.println("----------------------");

                index++;

            } else {
                System.out.println("Statue array is full");
            }

        } else {
            System.out.println("Statue is null");
        }
    }
}