class MapRunner {

    public static void main(String[] args) {

        MapStore store = new MapStore();

        Map[] maps = new Map[10];

        maps[0] = new Map("India", "Road", "India Map", "1:50", 2021);
        maps[1] = new Map("China", "Politica", "USA Map", "3:12", 2012);
        maps[2] = new Map("Japan", "Political", "Japan Map", "1:0", 2021);
        maps[3] = new Map("Australia", "Tourist", "Australia Map", "1:19", 2019);
        maps[4] = new Map("USA", "", "UK Map", "1:20", 2022);
        maps[5] = new Map("UK", "Political", "Germany Map", "2:18", 2018);
        maps[6] = new Map("France", "Physical", "France Map", "1:16", 2015);
        maps[7] = new Map("Germany", "Road", "Canada Map", "1:14", 2016);
        maps[8] = new Map("Canada", "Tourist", "Brazil Map", "1:22", 2027);
        maps[9] = new Map("Brazil", "Political", "China Map", "1:7", 2026);

        store.save(maps[0]);
        store.save(maps[1]);
        store.save(maps[2]);
        store.save(maps[3]);
        store.save(maps[4]);
        store.save(maps[5]);
        store.save(maps[6]);
        store.save(maps[7]);
        store.save(maps[8]);
        store.save(maps[9]);
    }
}