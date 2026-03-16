class Pasta {

    String[] pastas;
    int currentIndex = 0;

    void storePasta(String pastaName) {

        System.out.println("Running storePasta in Pasta class");
        System.out.println("pastaName: " + pastaName);

        if (this.pastas != null) {

            System.out.println("Array is not null");

            if (currentIndex < pastas.length) {

                System.out.println("Index is within array length");

                pastas[currentIndex] = pastaName;
                System.out.println(pastaName + " stored at index " + currentIndex);

                currentIndex++;

                System.out.println("Next index value is: " + currentIndex);
            }
            else {
                System.out.println("Array is full");
            }

        }
        else {
            System.out.println("Array is null");
        }
		System.out.println("------------------");
    }

    boolean searchPasta(String searchName) {

        System.out.println("Running searchPasta in Pasta class");
        System.out.println("Searching for: " + searchName);

        if (pastas != null) {

            System.out.println("Array is not null, starting comparison");

            for (String pasta : pastas) {

                System.out.println("Comparing pasta: " + pasta + " with searchName: " + searchName);

                if (pasta != null && pasta == searchName) {
                    System.out.println("Match found: " + pasta);
                    return true;
                }
                else {
                    System.out.println("No match for this pasta");
                }
            }

            System.out.println("Pasta not found in the array");
        }
        else {
            System.out.println("Array is null");
        }

        return false;
    }
}