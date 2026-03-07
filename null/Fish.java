class Fish {

    String type;
    int age;

    Fish(String type, int age) {
        this.type = type;
        this.age = age;
    }

    void printDetails() {
        System.out.println("Fish Type: " + this.type);
        System.out.println("Age: " + this.age);
    }
}