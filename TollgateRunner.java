class TollgateRunner {

    public static void main(String[] args) {

        TollgateStore store = new TollgateStore();

        Tollgate[] tollgates = new Tollgate[10];

        tollgates[0] = new Tollgate("Nice Road", "NH48", "Bangalore", 95, 7);
        tollgates[1] = new Tollgate("Davangere", "NH48", "Davangere", 75, 4);
        tollgates[2] = new Tollgate("Tumkur", "NH48", "Tumkur", 50, 4);
        tollgates[3] = new Tollgate("Chitradurga", "NH48", "Chitradurga", 80, 5);
        tollgates[4] = new Tollgate("Kengeri", "NH275", "Mysore Road", 65, 4);
        tollgates[5] = new Tollgate("Bidadi", "NH275", "Ramanagara", 55, 4);
        tollgates[6] = new Tollgate("Attibele", "NH44", "Border", 90, 6);
        tollgates[7] = new Tollgate("Haveri", "NH48", "Haveri", 50, 3);
        tollgates[8] = new Tollgate("Nelamangala", "NH75", "Bangalore", 75, 3);
        tollgates[9] = new Tollgate("Hosur", "NH44", "Hosur", 95, 5);

        for(int i = 0; i < tollgates.length; i++) {
            store.save(tollgates[i]);
        }
    }
}
