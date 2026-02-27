class Google {

    String companyName;
    String ceoName;
    String headquartersLocation;
    int foundedYear;
    int totalEmployees;
    double annualRevenue;
    String mainProduct;
    String searchEngineName;
    String emailService;
    String videoPlatform;
    String operatingSystem;
    String cloudService;
    String browserName;
    String aiPlatform;
    String parentCompany;
    String stockSymbol;
    String founder1;
    String founder2;
    String companyType;
    String officialWebsite;

    Google(String companyName, String ceoName, String headquartersLocation,
           int foundedYear, int totalEmployees, double annualRevenue,
           String mainProduct, String searchEngineName, String emailService,
           String videoPlatform, String operatingSystem, String cloudService,
           String browserName, String aiPlatform, String parentCompany,
           String stockSymbol, String founder1, String founder2,
           String companyType, String officialWebsite) {

        this.companyName = companyName;
        this.ceoName = ceoName;
        this.headquartersLocation = headquartersLocation;
        this.foundedYear = foundedYear;
        this.totalEmployees = totalEmployees;
        this.annualRevenue = annualRevenue;
        this.mainProduct = mainProduct;
        this.searchEngineName = searchEngineName;
        this.emailService = emailService;
        this.videoPlatform = videoPlatform;
        this.operatingSystem = operatingSystem;
        this.cloudService = cloudService;
        this.browserName = browserName;
        this.aiPlatform = aiPlatform;
        this.parentCompany = parentCompany;
        this.stockSymbol = stockSymbol;
        this.founder1 = founder1;
        this.founder2 = founder2;
        this.companyType = companyType;
        this.officialWebsite = officialWebsite;
    }

    void display() {
			System.out.println("Company Name: " + companyName);
			System.out.println("CEO Name: " + ceoName);
			System.out.println("Headquarters Location: " + headquartersLocation);
			System.out.println("Founded Year: " + foundedYear);
			System.out.println("Total Employees: " + totalEmployees);
			System.out.println("Annual Revenue: " + annualRevenue);
			System.out.println("Main Product: " + mainProduct);
			System.out.println("Search Engine Name: " + searchEngineName);
			System.out.println("Email Service: " + emailService);
			System.out.println("Video Platform: " + videoPlatform);
			System.out.println("Operating System: " + operatingSystem);
			System.out.println("Cloud Service: " + cloudService);
			System.out.println("Browser Name: " + browserName);
			System.out.println("AI Platform: " + aiPlatform);
			System.out.println("Parent Company: " + parentCompany);
			System.out.println("Stock Symbol: " + stockSymbol);
			System.out.println("Founder 1: " + founder1);
			System.out.println("Founder 2: " + founder2);
			System.out.println("Company Type: " + companyType);
			System.out.println("Official Website: " + officialWebsite);
			System.out.println("----------------------------");
			

    }
}