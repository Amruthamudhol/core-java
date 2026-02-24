class CricketRunner {

    public static void main(String[] args) {

        Cricket finalMatch = new Cricket(
            "T20",
            "India",
            "South Africa",
            "Rohit Sharma",
            "Aiden Markram",
            "Rahul Dravid",
            "Rob Walter",
            "Kensington Oval",
            "Bridgetown",
            "29 June 2024",
            176, 7, 20.0,
            169, 8, 20.0,
            "Virat Kohli",
            "Chris Gaffaney",
            "Richard Illingworth",
            true,
            7,
            "Barbados",
            28000,
            "ICC T20 World Cup 2024"
        );

        System.out.println("Match: " + finalMatch.team1 + " vs " + finalMatch.team2);
        System.out.println("Format: " + finalMatch.format);
        System.out.println("Tournament: " + finalMatch.tournament);
        System.out.println("Date: " + finalMatch.matchDate);

        System.out.println("Venue: " + finalMatch.stadium + ", " + finalMatch.city + ", " + finalMatch.country);
        System.out.println("Audience: " + finalMatch.audience);

        System.out.println("Captains: " + finalMatch.captain1 + " & " + finalMatch.captain2);
        System.out.println("Coaches: " + finalMatch.coach1 + " & " + finalMatch.coach2);

        System.out.println("India Score: " + finalMatch.team1Runs + "/" + finalMatch.team1Wickets +
                " in " + finalMatch.team1Overs + " overs");

        System.out.println("South Africa Score: " + finalMatch.team2Runs + "/" + finalMatch.team2Wickets +
                " in " + finalMatch.team2Overs + " overs");

        System.out.println("Toss Won By India: " + finalMatch.tossWonByTeam1);
        System.out.println("Margin Runs: " + finalMatch.marginRuns);

        System.out.println("Winner: " + finalMatch.team1 + " by " + finalMatch.marginRuns + " runs");

        System.out.println("Player of the Match: " + finalMatch.playerOfMatch);
        System.out.println("Umpires: " + finalMatch.umpire1 + " & " + finalMatch.umpire2);
    }
}





