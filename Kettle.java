class Kettle {

    String[] kettles;
    int currentIndex = 0;

    void storeKettle(String kettleName) {

        System.out.println("Running storeKettle in Kettle class");
        System.out.println("kettleName: " + kettleName);

        if (this.kettles != null) {

            System.out.println("Array is not null");

            if (currentIndex < kettles.length) {

                System.out.println("Index is within array length");

                kettles[currentIndex] = kettleName;
                System.out.println(kettleName + " stored at index " + currentIndex);

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
		System.out.println("-----------------");
    }

    boolean searchKettle(String searchName) {

        System.out.println("Running searchKettle in Kettle class");
        System.out.println("Searching for: " + searchName);

        if (kettles != null) {

            System.out.println("Array is not null, starting comparison");

            for (String kettle : kettles) {

                System.out.println("Comparing kettle: " + kettle + " with searchName: " + searchName);

                if (kettle != null && kettle == searchName) {
                    System.out.println("Match found: " + kettle);
                    return true;
                }
                else {
                    System.out.println("No match for this kettle");
                }
            }

            System.out.println("Kettle not found in the array");
        } 
        else {
            System.out.println("Array is null");
        }

        return false;
    }
}