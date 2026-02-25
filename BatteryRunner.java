class BatteryRunner {

    public static void main(String[] args) {

        Battery b1 = new Battery();
        System.out.println(b1.brand);
        System.out.println(b1.type);
        System.out.println(b1.capacity);
        System.out.println(b1.voltage);
        System.out.println(b1.isRechargeable);
        System.out.println("------------------");

        Battery b2 = new Battery("Duracell");
        System.out.println(b2.brand);
        System.out.println(b2.type);
        System.out.println(b2.capacity);
        System.out.println(b2.voltage);
        System.out.println(b2.isRechargeable);
        System.out.println("------------------");

        Battery b3 = new Battery("Eveready", "Alkaline");
        System.out.println(b3.brand);
        System.out.println(b3.type);
        System.out.println(b3.capacity);
        System.out.println(b3.voltage);
        System.out.println(b3.isRechargeable);
        System.out.println("------------------");

        Battery b4 = new Battery("Panasonic", "Lithium", 2000);
        System.out.println(b4.brand);
        System.out.println(b4.type);
        System.out.println(b4.capacity);
        System.out.println(b4.voltage);
        System.out.println(b4.isRechargeable);
        System.out.println("------------------");

        Battery b5 = new Battery("Sony", "NiMH", 2500, 1.5);
        System.out.println(b5.brand);
        System.out.println(b5.type);
        System.out.println(b5.capacity);
        System.out.println(b5.voltage);
        System.out.println(b5.isRechargeable);
        System.out.println("------------------");

        Battery b6 = new Battery("Samsung", "Lithium-ion", 3000, 3.7, true);
        System.out.println(b6.brand);
        System.out.println(b6.type);
        System.out.println(b6.capacity);
        System.out.println(b6.voltage);
        System.out.println(b6.isRechargeable);
        System.out.println("------------------");
    }
}