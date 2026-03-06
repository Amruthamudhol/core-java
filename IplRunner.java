class IplRunner {

    public static void main(String[] args) {

        Team1 team = new Team1("RCB", 15);
        Stadium1 stadium = new Stadium1("Chinnaswamy", 40000);
        Umpire umpire = new Umpire("Anil", 10);
        Broadcaster broadcaster = new Broadcaster("Star Sports", "India");
        Trophy1 trophy = new Trophy1("Gold", 8.5);

        Ipl ipl = new Ipl("IPL Season", 2024, 20.0, true, "TATA",
                team, stadium, umpire, broadcaster, trophy);

        System.out.println("Season: " + ipl.season);
        System.out.println("Year: " + ipl.year);
        System.out.println("Prize Money: " + ipl.prizeMoney);
        System.out.println("International Players: " + ipl.internationalPlayers);
        System.out.println("Sponsor: " + ipl.sponsor);

        if(ipl.team != null)
		{
            ipl.team.printDetails();
        } 
		else
		{
            System.out.println("Team details not available");
        }

        if(ipl.stadium != null)
		{
            ipl.stadium.printDetails();
        } 
		else 
		{
            System.out.println("Stadium details not available");
        }

        if(ipl.umpire != null)
		{
            System.out.println("Umpire Name: " + ipl.umpire.name);
        } else 
		{
            System.out.println("Umpire details not available");
        }

        if(ipl.broadcaster != null){
            System.out.println("Broadcaster: " + ipl.broadcaster.channel);
        } else 
		{
            System.out.println("Broadcaster details not available");
        }

        if(ipl.trophy != null){
            System.out.println("Trophy Material: " + ipl.trophy.material);
        } else 
		{
            System.out.println("Trophy details not available");
        }
    }
}