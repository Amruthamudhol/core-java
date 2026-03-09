class Calendar {
    int year;
    Company company;
    CalendarType type;

    Calendar(int year, Company company, CalendarType type) {
        this.year = year;
        this.company = company;
        this.type = type;
    }

    void printInfo() {
        System.out.println("Calendar Year: " + this.year);

        if (this.company != null) {
            System.out.println("Company Name: " + this.company.name);
        } else {
            System.out.println("Company is null");
        }


        System.out.println("----------------------");
    }
}