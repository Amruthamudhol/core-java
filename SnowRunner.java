class SnowRunner {

    public static void main(String[] args) {

        Snow s1 = new Snow();
        System.out.println(s1.type);
        System.out.println(s1.color);
        System.out.println(s1.temperature);
        System.out.println(s1.thickness);
        System.out.println(s1.isMelting);
        System.out.println("------------------");

        Snow s2 = new Snow("Powder");
        System.out.println(s2.type);
        System.out.println(s2.color);
        System.out.println(s2.temperature);
        System.out.println(s2.thickness);
        System.out.println(s2.isMelting);
        System.out.println("------------------");

        Snow s3 = new Snow("Wet", "White");
        System.out.println(s3.type);
        System.out.println(s3.color);
        System.out.println(s3.temperature);
        System.out.println(s3.thickness);
        System.out.println(s3.isMelting);
        System.out.println("------------------");

        Snow s4 = new Snow("Granular", "Light White", -5.0);
        System.out.println(s4.type);
        System.out.println(s4.color);
        System.out.println(s4.temperature);
        System.out.println(s4.thickness);
        System.out.println(s4.isMelting);
        System.out.println("------------------");

        Snow s5 = new Snow("Slush", "Grey", 0.0, 3.5);
        System.out.println(s5.type);
        System.out.println(s5.color);
        System.out.println(s5.temperature);
        System.out.println(s5.thickness);
        System.out.println(s5.isMelting);
        System.out.println("------------------");

        Snow s6 = new Snow("Blizzard", "Bright White", -10.0, 10.5, true);
        System.out.println(s6.type);
        System.out.println(s6.color);
        System.out.println(s6.temperature);
        System.out.println(s6.thickness);
        System.out.println(s6.isMelting);
        System.out.println("------------------");
    }
}