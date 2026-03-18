public class PetroleumRunner {

    public static void main(String[] args) {

        PetroleumCompany petroleum = new PetroleumCompany();
        petroleum.companies = new String[5];

        petroleum.storeCompany("Indian Oil");
        petroleum.storeCompany("Bharat Petroleum");
        petroleum.storeCompany("Hindustan Petroleum");
        petroleum.storeCompany("Reliance Petroleum");
        petroleum.storeCompany("ONGC");

        boolean result = petroleum.searchCompany("Hindustan Petroleum");
        System.out.println("Search Result: " + result);

        boolean updateIndex = petroleum.updateCompany(1, "HP");
        System.out.println("Update by Index Result: " + updateIndex);

        boolean updateName = petroleum.updateCompany("Indian Oil", "IOCL");
        System.out.println("Update by Name Result: " + updateName);

        boolean deleteIndex = petroleum.deleteCompany(2);
        System.out.println("Delete by Index Result: " + deleteIndex);

        boolean deleteName = petroleum.deleteCompany("ONGC");
        System.out.println("Delete by Name Result: " + deleteName);

        System.out.println("Final Companies List:");
        for (String company : petroleum.companies) {
            System.out.println(company);
        }
    }
}