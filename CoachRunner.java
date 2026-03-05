class CoachRunner {

    public static void main(String[] args) {

        Team team = new Team("India", 15);
        Stadium stadium = new Stadium("Chinnaswamy", 40000);
        Certificate certificate = new Certificate("Level A", 2018);
        Contract contract = new Contract(3, 5000000);
        Equipment equipment = new Equipment("Training Kit", 20);

        Coach coach = new Coach("Rahul", 12, 750000.0, true, "Cricket",team, stadium, certificate, contract, equipment);

                
        System.out.println("Coach Name: " + coach.name);
        System.out.println("Experience: " + coach.experience);
        System.out.println("Salary: " + coach.salary);
        System.out.println("International Coach: " + coach.internationalCoach);
        System.out.println("Sport: " + coach.sport);

        System.out.println("Team: " + coach.team.teamName);
        System.out.println("Stadium: " + coach.stadium.stadiumName);
        System.out.println("Certificate: " + coach.certificate.certificateName);
        System.out.println("Contract Years: " + coach.contract.years);
        System.out.println("Equipment: " + coach.equipment.type);
    }
}