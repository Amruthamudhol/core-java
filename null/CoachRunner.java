class CoachRunner {

    public static void main(String[] args) {

        Team team = new Team("India", 15);
        Stadium stadium = new Stadium("Chinnaswamy", 40000);
        Certificate certificate = new Certificate("Level A", 2018);
        Contract contract = new Contract(3, 5000000);
        Equipment equipment = new Equipment("Training Kit", 20);

        Coach coach = new Coach("Rahul", 12, 750000.0, true, "Cricket",
                team, stadium, certificate, contract, equipment);

        System.out.println("Coach Name: " + coach.name);
        System.out.println("Experience: " + coach.experience);
        System.out.println("Salary: " + coach.salary);
        System.out.println("International Coach: " + coach.internationalCoach);
        System.out.println("Sport: " + coach.sport);

        if(coach.team != null)
		{
            coach.team.printDetails();
        } 
		else 
		{
            System.out.println("Team details not available");
        }

        if(coach.stadium != null){
            coach.stadium.printDetails();
        } 
		else 
		{
            System.out.println("Stadium details not available");
        }

        if(coach.certificate != null){
            coach.certificate.printDetails();
        }
		else 
		{
            System.out.println("Certificate details not available");
        }

        if(coach.contract != null)
		{
            coach.contract.printDetails();
        } 
		else
		{
            System.out.println("Contract details not available");
        }

        if(coach.equipment != null)
		{
            coach.equipment.printDetails();
        } 
		else 
		{
            System.out.println("Equipment details not available");
        }
    }
}