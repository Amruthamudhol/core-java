class Zoo {

    String name;
    String location;

    Zoo(String name) {
        this.name = name;
        System.out.println("Created Zoo using String constructor");
    }

    Zoo(String name, String location) {
        this.name = name;
        this.location = location;
        System.out.println("Created Zoo using String, String constructor");
    }
}