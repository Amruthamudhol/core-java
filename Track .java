class Track {

    String name;
    double length;     
    String location;
    String type;        
    boolean isIndoor;
	
    Track() {
        System.out.println("Constructor 1: Default");
    }

    Track(String name) {
        this.name = name;
    }

    Track(String name, double length) {
        this.name = name;
        this.length = length;
    }

    Track(String name, double length, String location) {
        this.name = name;
        this.length = length;
        this.location = location;
    }


    Track(String name, double length, String location, String type) {
        this.name = name;
        this.length = length;
        this.location = location;
        this.type = type;
    }

    Track(String name, double length, String location, String type, boolean isIndoor) {
        this.name = name;
        this.length = length;
        this.location = location;
        this.type = type;
        this.isIndoor = isIndoor;
    }
}