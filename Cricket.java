class Cricket {

    String format;
    String team1;
    String team2;

    String captain1;
    String captain2;

    String coach1;
    String coach2;

    String stadium;
    String city;
    String matchDate;

    int team1Runs;
    int team1Wickets;
    double team1Overs;

    int team2Runs;
    int team2Wickets;
    double team2Overs;

    String playerOfMatch;
    String umpire1;
    String umpire2;

    boolean tossWonByTeam1;
    int marginRuns;

    String country;
    int audience;
    String tournament;

    Cricket(String format, String team1, String team2,
            String captain1, String captain2,
            String coach1, String coach2,
            String stadium, String city, String matchDate,
            int team1Runs, int team1Wickets, double team1Overs,
            int team2Runs, int team2Wickets, double team2Overs,
            String playerOfMatch, String umpire1, String umpire2,
            boolean tossWonByTeam1, int marginRuns,
            String country, int audience, String tournament) {

        this.format = format;
        this.team1 = team1;
        this.team2 = team2;
        this.captain1 = captain1;
        this.captain2 = captain2;
        this.coach1 = coach1;
        this.coach2 = coach2;
        this.stadium = stadium;
        this.city = city;
        this.matchDate = matchDate;
        this.team1Runs = team1Runs;
        this.team1Wickets = team1Wickets;
        this.team1Overs = team1Overs;
        this.team2Runs = team2Runs;
        this.team2Wickets = team2Wickets;
        this.team2Overs = team2Overs;
        this.playerOfMatch = playerOfMatch;
        this.umpire1 = umpire1;
        this.umpire2 = umpire2;
        this.tossWonByTeam1 = tossWonByTeam1;
        this.marginRuns = marginRuns;
        this.country = country;
        this.audience = audience;
        this.tournament = tournament;
    }
}