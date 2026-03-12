public class PetroleumRunner {

    public static void main(String[] args) {

        PetroleumCompany petroleum = new PetroleumCompany();

        petroleum.companies = new String[5];  

        petroleum.storeCompany("Indian Oil");
        petroleum.storeCompany("Bharat Petroleum");
        petroleum.storeCompany("Hindustan Petroleum");
        petroleum.storeCompany("Reliance Petroleum");
        petroleum.storeCompany("ONGC");
    }
}