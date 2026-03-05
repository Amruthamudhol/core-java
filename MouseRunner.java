class MouseRunner {

    public static void main(String[] args) {

        Battery battery = new Battery("AA", 2000);
        Sensor sensor = new Sensor("Optical", 1600);
        Cable cable = new Cable("USB", 1.5);
        Manufacturer manufacturer = new Manufacturer("Logitech", "USA");
        Warranty warranty = new Warranty(2, true);

        Mouse mouse = new Mouse( "Logitech", 999.0,true,6, "Black", battery, sensor, cable, manufacturer, warranty );
    }
}