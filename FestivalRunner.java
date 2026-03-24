class FestivalRunner {

    public static void main(String[] args) {

        FestivalStore store = new FestivalStore();

        Festival f1  = new Festival("Halloween", "USA", "October", "Cultural", 2024);
        Festival f2  = new Festival("Christmas", "Worldwide", "December", "Religious", 2024);
        Festival f3  = new Festival("Holi", "India", "March", "Cultural", 2024);
        Festival f4  = new Festival("Baisakhi", "India", "April", "Harvest", 2024);
        Festival f5  = new Festival("Diwali", "India", "November", "Religious", 2024);
        Festival f6  = new Festival("Navratri", "India", "October", "Religious", 2024);
        Festival f7  = new Festival("Onam", "India", "September", "Cultural", 2024);
        Festival f8  = new Festival("Ganesh Chaturthi", "India", "September", "Religious", 2024);
        Festival f9  = new Festival("Pongal", "India", "January", "Harvest", 2024);
        Festival f10 = new Festival("Eid", "Worldwide", "April", "Religious", 2024);

        store.save(f1);
        store.save(f2);
        store.save(f3);
        store.save(f4);
        store.save(f5);
        store.save(f6);
        store.save(f7);
        store.save(f8);
        store.save(f9);
        store.save(f10);
    }
}
