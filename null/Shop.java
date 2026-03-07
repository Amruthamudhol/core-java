class Shop {

    String shopName;
    String location;

    Shop(String shopName, String location) {
        this.shopName = shopName;
        this.location = location;
    }

    void printDetails() {
        System.out.println("Shop Name: " + this.shopName);
        System.out.println("Location: " + this.location);
    }
}