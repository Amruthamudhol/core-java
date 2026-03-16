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
		System.out.println("---------------");
    }
	
	
	boolean searchCompany(String searchName) {

        System.out.println("Running searchCompany in PetroleumCompany");
        System.out.println("Searching for: " + searchName);

        if (companies != null) {

            System.out.println("Array is not null, starting comparison");

            for (String company : companies) {

                System.out.println("Comparing company: " + company + " with searchName: " + searchName);

                if (company != null && company == searchName) {
                    System.out.println("Match found: " + company);
                    return true;
                }
                else {
                    System.out.println("No match for this company");
                }
            }

            System.out.println("Company not found in the array");
        } 
        else {
            System.out.println("Array is null");
        }

        return false;
    }
}