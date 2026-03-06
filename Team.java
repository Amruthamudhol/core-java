class Team {

    String teamName;
    int players;

    Team(String teamName, int players) {
        this.teamName = teamName;
        this.players = players;
    }

    void printDetails() {
        System.out.println("Team Details:");
        System.out.println("Team Name: " + this.teamName);
        System.out.println("Number of Players: " + this.players);
    }
}