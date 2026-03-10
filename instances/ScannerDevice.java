class ScannerDevice {

    float[] resolutionLevels;
    DocumentUnit[] documentStack;

    ScannerDevice(float[] resolutionLevels, DocumentUnit[] documentStack) {
        this.resolutionLevels = resolutionLevels;
        this.documentStack = documentStack;
    }

    void info() {

        System.out.println("Scanner Resolution Levels:");

        if (resolutionLevels != null) {

            System.out.println("Total Resolutions: " + this.resolutionLevels.length);

            for (float level : resolutionLevels) {
                System.out.println("Resolution: " + level);
            }
        }

        System.out.println("Document Stack Details:");

        if (documentStack != null) {

            System.out.println("Total Documents: " + this.documentStack.length);

            for (DocumentUnit doc : documentStack) {
                doc.display();
            }
        }
    }
}