class Clock{
	
	String brand;
    String color;
    double price;
	
	void setAlarm(){
		System.out.println("set alarm in clock..");
	}
	
	void tick(){
		System.out.println("clock is ticking..");
	}
	
	void showClockDetails() {
    System.out.println("Brand: " + brand);
    System.out.println("Color: " + color);
    System.out.println("Price: " + price);

	}
}