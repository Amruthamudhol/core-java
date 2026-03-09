class Dmart {
    int employees;      
    Manager manager;    
    Department department;  

    Dmart(int employees, Manager manager, Department department) {
        this.employees = employees;
        this.manager = manager;
        this.department = department;
    }

    void printDetails() {
        System.out.println("Total Employees: " + this.employees);

        if (this.manager != null) {
            System.out.println("Manager Name: " + this.manager.name);
        } else {
            System.out.println("Manager is null");
        }

    }
}