class IplRunner {

    public static void main(String[] args) {

        Team1 team = new Team1("RCB", 15);
        Stadium1 stadium = new Stadium1("Chinnaswamy", 40000);
        Umpire umpire = new Umpire("Anil", 10);
        Broadcaster broadcaster = new Broadcaster("Star Sports", "India");
        Trophy1 trophy = new Trophy1("Gold", 8.5);

        Ipl ipl = new Ipl("IPL Season", 2024, 20.0, true, "TATA",team, stadium, umpire, broadcaster, trophy);

                
        System.out.println("Season: " + ipl.season);
        System.out.println("Year: " + ipl.year);
        System.out.println("Prize Money: " + ipl.prizeMoney);
        System.out.println("International Players: " + ipl.internationalPlayers);
        System.out.println("Sponsor: " + ipl.sponsor);

        System.out.println("Team: " + ipl.team.teamName);
        System.out.println("Stadium: " + ipl.stadium.stadiumName);
        System.out.println("Umpire: " + ipl.umpire.name);
        System.out.println("Broadcaster: " + ipl.broadcaster.channel);
        System.out.println("Trophy Material: " + ipl.trophy.material);
    }
}