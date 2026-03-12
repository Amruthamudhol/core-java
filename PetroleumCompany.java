class PetroleumCompany {

    String[] companies;   
    int currentIndex = 0; 

    void storeCompany(String companyName) {

        System.out.println("Running storeCompany in PetroleumCompany");
        System.out.println("companyName:" + companyName);

        if (this.companies != null) {

            System.out.println("Array is not null");

            if (currentIndex < companies.length) {

                System.out.println("Index is within array length");

                companies[currentIndex] = companyName;
                System.out.println(companyName + " stored at index " + currentIndex);

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
    }
}