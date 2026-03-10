class Banner {

    byte[] bannerSizes;
    Design[] designList;

    Banner(byte[] bannerSizes, Design[] designList) {
        this.bannerSizes = bannerSizes;
        this.designList = designList;
    }

    void info() {

        System.out.println("Banner Sizes:");

        if (bannerSizes != null) {

            System.out.println("Total Sizes: " + this.bannerSizes.length);

            for (byte size : bannerSizes) {
                System.out.println("Size Level: " + size);
            }
        }

        System.out.println("Design Details:");

        if (designList != null) {

            System.out.println("Total Designs: " + this.designList.length);

            for (Design design : designList) {
                design.display();
            }
        }
    }
}