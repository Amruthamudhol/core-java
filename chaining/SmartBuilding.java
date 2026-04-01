class SmartBuilding extends Building {

    double area;
    char grade;
    long rooms;

    SmartBuilding(int floors, String name, boolean hasLift,
                  double area, char grade, long rooms) {

        super(floors, name, hasLift);
        this.area = area;
        this.grade = grade;
        this.rooms = rooms;
    }

    void display() {
        System.out.println("Floors: " + floors);
        System.out.println("Name: " + name);
        System.out.println("Has Lift: " + hasLift);
        System.out.println("Area: " + area);
        System.out.println("Grade: " + grade);
        System.out.println("Rooms: " + rooms);
        System.out.println("----------------------");
    }
}