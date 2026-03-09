class Court {
    int judges;        
    Location location; 
    CaseType type;     

    Court(int judges, Location location, CaseType type) {
        this.judges = judges;
        this.location = location;
        this.type = type;
    }

    void printInfo() {
        System.out.println("Number of Judges: " + this.judges);

        if (this.location != null) {
            System.out.println("Court Location: " + this.location.name);
        } else {
            System.out.println("Court Location is null");
        }

        System.out.println("--------------------");
    }
}