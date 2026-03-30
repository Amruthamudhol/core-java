public class MediaRunner {

    public static void main(String[] args) {

        DigitalMedia dm1 = new DigitalMedia();
        DigitalMedia dm2 = new DigitalMedia();

        dm1.title = "Triggered Insaan";
        dm1.creator = "Nishay Malhan";
        dm1.duration = 60;
        dm1.format = "MP4";
        dm1.downloadable = true;
        dm1.resolution = 1080;
        dm1.platform = "YouTube";
        dm1.licenseType = "Creative Commons";

        dm1.play();
        dm1.showDigitalInfo();
        dm1.pause();

        System.out.println("-------------");

        dm2.title = "Tech Review";
        dm2.creator = "Sneha";
        dm2.duration = 45;
        dm2.format = "Mp3";
        dm2.downloadable = false;
        dm2.resolution = 720;
        dm2.platform = "Insta";
        dm2.licenseType = "Proprietary";

        dm2.play();
        dm2.showDigitalInfo();
        dm2.pause();

        System.out.println("==== Parent type, subclass objects ===");

        Media m1 = new DigitalMedia();
        Media m2 = new DigitalMedia();

        m1.title = "Music Video";
        m1.creator = "Amit";
        m1.duration = 5;

        m2.title = "Podcast Episode";
        m2.creator = "Raj Shamani";
        m2.duration = 30;

        m1.play();
        m1.showInfo();
        m1.pause();

        System.out.println("-------------");

        m2.play();
        m2.showInfo();
        m2.pause();

        System.out.println("=== Parent class instances ====");

        Media pm1 = new Media();
        Media pm2 = new Media();

        pm1.title = "Audio Book 1";
        pm1.creator = "Rahul";
        pm1.duration = 120;

        pm1.play();
        pm1.showInfo();
        pm1.pause();

        System.out.println("-------------");

        pm2.title = "Audio Book 2";
        pm2.creator = "Pallavi";
        pm2.duration = 90;

        pm2.play();
        pm2.showInfo();
        pm2.pause();
    }
}