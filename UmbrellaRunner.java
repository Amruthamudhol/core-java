class UmbrellaRunner {

    public static void main(String[] args) {

        Umbrella u1 = new Umbrella();
        System.out.println(u1.brand);
        System.out.println(u1.color);
        System.out.println(u1.price);
        System.out.println(u1.size);
        System.out.println(u1.isAutomatic);
        System.out.println("------------------");

        Umbrella u2 = new Umbrella("Popy");
        System.out.println(u2.brand);
        System.out.println(u2.color);
        System.out.println(u2.price);
        System.out.println(u2.size);
        System.out.println(u2.isAutomatic);
        System.out.println("------------------");

        Umbrella u3 = new Umbrella("SkyLine", "Black");
        System.out.println(u3.brand);
        System.out.println(u3.color);
        System.out.println(u3.price);
        System.out.println(u3.size);
        System.out.println(u3.isAutomatic);
        System.out.println("------------------");

        Umbrella u4 = new Umbrella("RainMaster", "Blue", 499.0);
        System.out.println(u4.brand);
        System.out.println(u4.color);
        System.out.println(u4.price);
        System.out.println(u4.size);
        System.out.println(u4.isAutomatic);
        System.out.println("------------------");

        Umbrella u5 = new Umbrella("Cloud", "Red", 699.0, 40);
        System.out.println(u5.brand);
        System.out.println(u5.color);
        System.out.println(u5.price);
        System.out.println(u5.size);
        System.out.println(u5.isAutomatic);
        System.out.println("------------------");

        Umbrella u6 = new Umbrella("StormPro", "Green", 999.0, 42, true);
        System.out.println(u6.brand);
        System.out.println(u6.color);
        System.out.println(u6.price);
        System.out.println(u6.size);
        System.out.println(u6.isAutomatic);
        System.out.println("------------------");
    }
}