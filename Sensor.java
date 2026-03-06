class Sensor {

    String sensorType;
    int dpi;

    Sensor(String sensorType,int dpi) {
        this.sensorType = sensorType;
        this.dpi = dpi;
		
    }
	void printdetails(){
		System.out.println("Sensor details, sensorType:"+this.sensorType +",dpi:"+this.dpi);
		
	}
}