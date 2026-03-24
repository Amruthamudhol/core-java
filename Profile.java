class Profile {

    String name;
    int age;
    String email;
    String city;
    long phone;

    Profile(String name, int age, String email, String city, long phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.city = city;
        this.phone = phone;
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age +
                           ", Email: " + email + ", City: " + city +
                           ", Phone: " + phone);
    }
}