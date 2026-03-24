class AcidStore {

    Acid[] acids = new Acid[10];
    int index = 0;

    void save(Acid acid) {

        if (acid != null && acids!=null) {

            if (index < acids.length) {

                acids[index] = acid;

                System.out.println("Acid record inserted");
                System.out.println("Index number: " + index);
                System.out.println("Displaying stored acid:");
                acid.showDetails();
                System.out.println("*******************************");

                index++;

            } else {
                System.out.println("AcidStore capacity exceeded");
            }

        } else {
            System.out.println("Acid object not provided");
        }
    }
}