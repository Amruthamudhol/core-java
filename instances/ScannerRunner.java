class ScannerRunner {

    public static void main(String[] args) {

        float[] Levels = new float[3];
        Levels[0] = 300;
        Levels[1] = 600;
        Levels[2] = 1200;

        DocumentUnit[] docs = new DocumentUnit[3];

        DocumentUnit d1 = new DocumentUnit("ProjectReport", 25);
        DocumentUnit d2 = new DocumentUnit("InvoiceFile", 10);
        DocumentUnit d3 = new DocumentUnit("ResearchPaper", 40);

        docs[0] = d1;
        docs[1] = d2;
        docs[2] = d3;

        ScannerDevice scanner = new ScannerDevice(Levels, docs);

        scanner.info();
    }
}