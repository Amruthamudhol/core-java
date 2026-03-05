class Ipl {

    String season;
    int year;
    double prizeMoney;
    boolean internationalPlayers;
    String sponsor;

    Team1 team;
    Stadium1 stadium;
    Umpire umpire;
    Broadcaster broadcaster;
    Trophy1 trophy;

    Ipl(String season, int year, double prizeMoney, boolean internationalPlayers, String sponsor,
        Team1 team, Stadium1 stadium, Umpire umpire, Broadcaster broadcaster, Trophy1 trophy) {

        this.season = season;
        this.year = year;
        this.prizeMoney = prizeMoney;
        this.internationalPlayers = internationalPlayers;
        this.sponsor = sponsor;

        this.team = team;
        this.stadium = stadium;
        this.umpire = umpire;
        this.broadcaster = broadcaster;
        this.trophy = trophy;
    }
}