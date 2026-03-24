class CloudSoftwareStore {

    CloudSoftware[] softwares = new CloudSoftware[10];
    int index = 0;

    void save(CloudSoftware software) {

        if (software != null) {

            if (index < softwares.length) {

                softwares[index] = software;

                System.out.println("Cloud software stored at index " + index);
                software.printInfo();
                System.out.println("-----------------------------");

                index++;

            } else {
                System.out.println("Software list is full");
            }

        } else {
            System.out.println("Software is null");
        }
    }
}