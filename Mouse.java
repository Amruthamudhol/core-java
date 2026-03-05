class Mouse {
	
    String brand;
    double price;
    boolean wireless;
    int buttons;
    String color;
	
	Battery battery;
    Sensor sensor;
    Cable cable;
    Manufacturer manufacturer;
    Warranty warranty;
	
 Mouse( String brand,double price,boolean wireless,int buttons,String color,Battery battery, Sensor sensor,Cable cable, Manufacturer manufacturer, Warranty warranty)
    {
        this.brand = brand;
        this.price = price;
        this.wireless = wireless;
        this.buttons = buttons;
        this.color = color;

        this.battery = battery;
        this.sensor = sensor;
        this.cable = cable;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
    }
}