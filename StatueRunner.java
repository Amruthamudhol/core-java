class StatueRunner {

    public static void main(String[] args) {

        StatueStore store = new StatueStore();

        Statue[] statues = new Statue[10];

        statues[0] = new Statue("Statue of Unity", "India", "Iron", 167, 2018);
        statues[1] = new Statue("David", "Italy", "Marble", 8.17, 1504);
        statues[2] = new Statue("Christ the Redeemer", "Brazil", "Concrete", 90, 1931);
        statues[3] = new Statue("Spring Temple Buddha", "China", "Bronze", 108, 2008);
        statues[4] = new Statue("Motherland Calls", "Russia", "Concrete", 80, 1967);
        statues[5] = new Statue("Great Buddha", "Japan", "Bronze", 18, 1252);
        statues[6] = new Statue("The Thinker", "France", "Bronze", 5, 1904);
        statues[7] = new Statue("Moai", "Chile", "Stone", 18, 1400);
        statues[8] = new Statue("Little Mermaid", "Denmark", "Bronze", 1.55, 1913);
        statues[9] = new Statue("Statue of Liberty", "USA", "Copper", 90, 1896);

        for(int i = 0; i < statues.length; i++) {
            store.save(statues[i]);
        }
    }
}