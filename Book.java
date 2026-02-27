class Book {

    static void info(String title, int pages, double price) {
		
		System.out.println(title + " " + pages + " " + price);

        if (title == null) {
            System.out.println("Invalid book title");
            return;
        }

        if (pages <= 0) {
            System.out.println("Invalid page count");
            return;
        }

        if (price <= 0) {
            System.out.println("Invalid price");
            return;
        }

       
    }

    static void author(String name, int age, String country) {
		
		System.out.println(name + " " + age + " " + country);

        if (name == null) {
            System.out.println("Invalid author name");
            return;
        }

        if (age <= 0) {
            System.out.println("Invalid age");
            return;
        }

        if (country == null) {
            System.out.println("Invalid country");
            return;
        }

       
    }
}
