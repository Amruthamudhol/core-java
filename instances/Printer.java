class Printer {

    String[] documentNames;
    Ink[] inkDetails;

    Printer(String[] documentNames, Ink[] inkDetails) {
        this.documentNames = documentNames;
        this.inkDetails = inkDetails;
    }


    void info() {

        System.out.println("Documents in Printer:");

        if (documentNames != null) {

            System.out.println("Total Documents: " + this.documentNames.length);

            for (String document : documentNames) {
                System.out.println("Document: " + document);
            }
        }

        System.out.println("Ink Details:");

        if (inkDetails != null) {

            System.out.println("Total Ink Objects: " + this.inkDetails.length);

            for (Ink ink : inkDetails) {
                ink.display();
            }
        }
    }
}