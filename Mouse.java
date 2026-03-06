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
	void getdetails(){
		System.out.println("Mouse details, brand:" + this.brand + ", price:" + this.price + ", wireless:" + this.wireless);
		
	if(this.battery!=null)
	{
		this.battery.getinfo();
	}
	else
	{
		System.out.println("capacity is not there...");
	}
	if(this.sensor!=null)
	{
		this.sensor.printdetails();
	}
	else
	{
		System.out.println("sensortype is not there...");
	}
	
		
	}
}