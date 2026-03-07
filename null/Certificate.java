class Certificate {

    String certificateName;
    int year;

    Certificate(String certificateName, int year) {
        this.certificateName = certificateName;
        this.year = year;
    }

    void printDetails() {
        System.out.println("Certificate Details:");
        System.out.println("Certificate Name: " + this.certificateName);
        System.out.println("Year: " + this.year);
    }
}