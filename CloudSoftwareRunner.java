class CloudSoftwareRunner {

    public static void main(String[] args) {

        CloudSoftwareStore store = new CloudSoftwareStore();

        CloudSoftware[] softwares = new CloudSoftware[10];

        softwares[0] = new CloudSoftware("AWS", "Amazon", "IaaS", 3.0, 1000000);
        softwares[1] = new CloudSoftware("Azure", "Microsoft", "PaaS", 2.5, 900000);
        softwares[2] = new CloudSoftware("Google Cloud", "Google", "IaaS", 2.8, 850000);
        softwares[3] = new CloudSoftware("Dropbox", "Dropbox Inc", "Storage", 1.5, 700000);
        softwares[4] = new CloudSoftware("Salesforce", "Salesforce", "CRM", 4.0, 650000);
        softwares[5] = new CloudSoftware("Slack", "Slack", "Communication", 2.2, 600000);
        softwares[6] = new CloudSoftware("Zoom", "Zoom", "Meeting", 3.1, 550000);
        softwares[7] = new CloudSoftware("GitHub", "Microsoft", "DevOps", 2.9, 500000);
        softwares[8] = new CloudSoftware("Heroku", "Salesforce", "PaaS", 1.8, 450000);
        softwares[9] = new CloudSoftware("Firebase", "Google", "Backend", 2.4, 400000);

        for(int i = 0; i < softwares.length; i++) {
            store.save(softwares[i]);
        }
    }
}