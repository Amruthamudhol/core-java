class DigitalMedia extends Media {

    String format;
    boolean downloadable;
    int resolution; 
    String platform;
    String licenseType;

    void showDigitalInfo() {
        showInfo();
        System.out.println("Format: " + format);
        System.out.println("Downloadable: " + downloadable);
        System.out.println("Resolution: " + resolution + "p");
        System.out.println("Platform: " + platform);
        System.out.println("License Type: " + licenseType);
    }
}