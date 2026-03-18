class PetroleumCompany {

    String[] companies;
    int currentIndex = 0;

    void storeCompany(String companyName) {

        System.out.println("Running storeCompany in PetroleumCompany");
        System.out.println("companyName: " + companyName);

        if (this.companies != null) {

            if (currentIndex < companies.length) {

                companies[currentIndex] = companyName;
                System.out.println(companyName + " stored at index " + currentIndex);

                currentIndex++;

            } else {
                System.out.println("Array is full");
            }
        } else {
            System.out.println("Array is null");
        }
        System.out.println("---------------");
    }

    //  SEARCH
    boolean searchCompany(String searchName) {

        System.out.println("Running searchCompany");
        System.out.println("Searching for: " + searchName);

        if (companies != null) {

            for (String company : companies) {

                System.out.println("Checking: " + company);

                if (company != null && company.equals(searchName)) {
                    System.out.println("Match found: " + company);
                    System.out.println("---------------");
                    return true;
                }
            }
        }

        System.out.println("Company not found");
        System.out.println("---------------");
        return false;
    }

    // UPDATE BY INDEX 
    boolean updateCompany(int index, String newName) {

        System.out.println("Running updateCompany by index");

        if (companies != null && index >= 0 && index < currentIndex) {

            System.out.println("Old value: " + companies[index]);

            companies[index] = newName;

            System.out.println("Updated to: " + newName);
            System.out.println("---------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("---------------");
        return false;
    }

    //  UPDATE BY NAME
    boolean updateCompany(String oldName, String newName) {

        System.out.println("Running updateCompany by name");

        if (companies != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + companies[i]);

                if (companies[i] != null && companies[i].equals(oldName)) {

                    System.out.println("Match found at index: " + i);

                    companies[i] = newName;

                    System.out.println("Updated to: " + newName);
                    System.out.println("---------------");
                    return true;
                }
            }
        }

        System.out.println("Company not found");
        System.out.println("---------------");
        return false;
    }

    // DELETE BY INDEX
    boolean deleteCompany(int index) {

        System.out.println("Running deleteCompany by index");

        if (companies != null && index >= 0 && index < currentIndex) {

            System.out.println("Deleting: " + companies[index]);

            companies[index] = null;

            System.out.println("Deleted successfully");
            System.out.println("---------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("---------------");
        return false;
    }

    //  DELETE BY NAME 
    boolean deleteCompany(String name) {

        System.out.println("Running deleteCompany by name");

        if (companies != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + companies[i]);

                if (companies[i] != null && companies[i].equals(name)) {

                    System.out.println("Match found at index: " + i);

                    companies[i] = null;

                    System.out.println("Deleted successfully");
                    System.out.println("---------------");
                    return true;
                }
            }
        }

        System.out.println("Company not found");
        System.out.println("---------------");
        return false;
    }
}