class Turbine {

    String[] turbines;
    int currentIndex = 0;

    void storeTurbine(String turbineName) {

        System.out.println("Running storeTurbine in Turbine class");
        System.out.println("turbineName: " + turbineName);

        if (this.turbines != null) {

            System.out.println("Array is not null");

            if (currentIndex < turbines.length) {

                System.out.println("Index is within array length");

                turbines[currentIndex] = turbineName;
                System.out.println(turbineName + " stored at index " + currentIndex);

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

    boolean searchTurbine(String searchName) {

        System.out.println("Running searchTurbine in Turbine class");
        System.out.println("Searching for: " + searchName);

        if (turbines != null) {

            System.out.println("Array is not null, starting comparison");

            for (String turbine : turbines) {

                System.out.println("Comparing turbine: " + turbine + " with searchName: " + searchName);

                if (turbine != null && turbine == searchName) {
                    System.out.println("Match found: " + turbine);
                    return true;
                }
                else {
                    System.out.println("No match for this turbine");
                }
            }

            System.out.println("Turbine not found in the array");
        }
        else {
            System.out.println("Array is null");
        }

        return false;
    }
}