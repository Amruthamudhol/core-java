class PastaRunner {

    public static void main(String[] args) {

        Pasta pasta = new Pasta();
        pasta.pastas = new String[10];

        pasta.storePasta("Macaroni");
        pasta.storePasta("Penne");
        pasta.storePasta("Fusilli");
        pasta.storePasta("Lasagna");
        pasta.storePasta("Tagliatelle");
        pasta.storePasta("Ravioli");
        pasta.storePasta("Farfalle");
        pasta.storePasta("Spaghetti");
        pasta.storePasta("Rigatoni");
        pasta.storePasta("Linguine");

        boolean result = pasta.searchPasta("Macaroni");

        System.out.println("Search Result: " + result);
    }
}