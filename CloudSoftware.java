class CloudSoftware {

    String name;
    String serviceType;
	String provider;
    double version;
    int users;

    CloudSoftware(String name,  String serviceType,String provider, double version, int users) {
        this.name = name;
        this.provider = provider;
        this.serviceType = serviceType;
        this.version = version;
        this.users = users;
    }

    void printInfo() {
        System.out.println("Name: " + name +
                           ", Provider: " + provider +
                           ", Service: " + serviceType +
                           ", Version: " + version +
                           ", Users: " + users);
    }
}