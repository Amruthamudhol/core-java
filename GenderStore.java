class GenderStore {

    String[] genders = {"Male", "Female", "Other"};

    void sortAsc() {
        System.out.println("Sorting Ascending");
        for (int i = 0; i < genders.length - 1; i++) {
            for (int j = 0; j < genders.length - 1 - i; j++) {
                if (genders[j].compareTo(genders[j + 1]) > 0) {
                    String temp = genders[j];
                    genders[j] = genders[j + 1];
                    genders[j + 1] = temp;
                }
            }
        }
    }

    void sortDesc() {
        System.out.println("Sorting Descending");
        for (int i = 0; i < genders.length - 1; i++) {
            for (int j = 0; j < genders.length - 1 - i; j++) {
                if (genders[j].compareTo(genders[j + 1]) < 0) {
                    String temp = genders[j];
                    genders[j] = genders[j + 1];
                    genders[j + 1] = temp;
                }
            }
        }
    }

    void display() {
        for (String g : genders) {
            System.out.println(g);
        }
        System.out.println("-----------");
    }
}