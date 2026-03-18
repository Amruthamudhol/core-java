class Turbine {

    String[] turbines;
    int currentIndex = 0;

    // STORE
    void storeTurbine(String turbineName) {

        System.out.println("Running storeTurbine");

        if (turbines != null) {

            if (currentIndex < turbines.length) {

                turbines[currentIndex] = turbineName;
                System.out.println(turbineName + " stored at index " + currentIndex);

                currentIndex++;

            } else {
                System.out.println("Array is full");
            }

        } else {
            System.out.println("Array is null");
        }

        System.out.println("-----------------");
    }

    // SEARCH (FIXED)
    boolean searchTurbine(String searchName) {

        System.out.println("Running searchTurbine");

        if (turbines != null) {

            for (String turbine : turbines) {

                if (turbine != null && turbine.equals(searchName)) {
                    System.out.println("Match found: " + turbine);
                    System.out.println("-----------------");
                    return true;
                }
            }
        }

        System.out.println("Turbine not found");
        System.out.println("-----------------");
        return false;
    }

    // UPDATE BY INDEX
    boolean updateTurbine(int index, String newName) {

        System.out.println("Running updateTurbine by index");

        if (turbines != null && index >= 0 && index < currentIndex) {

            turbines[index] = newName;

            System.out.println("Updated at index " + index);
            System.out.println("-----------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("-----------------");
        return false;
    }

    // UPDATE BY NAME
    boolean updateTurbine(String oldName, String newName) {

        System.out.println("Running updateTurbine by name");

        if (turbines != null) {

            for (int i = 0; i < currentIndex; i++) {

                if (turbines[i] != null && turbines[i].equals(oldName)) {

                    turbines[i] = newName;

                    System.out.println("Updated: " + oldName + " to " + newName);
                    System.out.println("-----------------");
                    return true;
                }
            }
        }

        System.out.println("Turbine not found");
        System.out.println("-----------------");
        return false;
    }

    // DELETE BY INDEX
    boolean deleteTurbine(int index) {

        System.out.println("Running deleteTurbine by index");

        if (turbines != null && index >= 0 && index < currentIndex) {

            turbines[index] = null;

            System.out.println("Deleted at index " + index);
            System.out.println("-----------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("-----------------");
        return false;
    }

    // DELETE BY NAME
    boolean deleteTurbine(String name) {

        System.out.println("Running deleteTurbine by name");

        if (turbines != null) {

            for (int i = 0; i < currentIndex; i++) {

                if (turbines[i] != null && turbines[i].equals(name)) {

                    turbines[i] = null;

                    System.out.println("Deleted: " + name);
                    System.out.println("-----------------");
                    return true;
                }
            }
        }

        System.out.println("Turbine not found");
        System.out.println("-----------------");
        return false;
    }
}