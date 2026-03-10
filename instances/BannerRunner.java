class BannerRunner {

    public static void main(String[] args) {

        byte[] sizes = new byte[3];
        sizes[0] = 2;
        sizes[1] = 4;
        sizes[2] = 6;

        Design[] designs = new Design[3];

        Design d1 = new Design("Festival Banner", 5);
        Design d2 = new Design("Sale Banner", 3);
        Design d3 = new Design("Welcome Banner", 4);

        designs[0] = d1;
        designs[1] = d2;
        designs[2] = d3;

        Banner banner = new Banner(sizes, designs);

        banner.info();
    }
}