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

        System.out.println("================================");
        boolean result = pasta.searchPasta("Macaroni");
        System.out.println("Search Result: " + result);

        System.out.println("================================");

        boolean updateIndex = pasta.updatePasta(1, "Penne Pasta");
        System.out.println("Update by Index Result: " + updateIndex);

        System.out.println("================================");

        boolean updateName = pasta.updatePasta("Fusilli", "Fusilli Special");
        System.out.println("Update by Name Result: " + updateName);

        System.out.println("================================");

        boolean deleteIndex = pasta.deletePasta(3);
        System.out.println("Delete by Index Result: " + deleteIndex);

        System.out.println("================================");

        boolean deleteName = pasta.deletePasta("Ravioli");
        System.out.println("Delete by Name Result: " + deleteName);

        System.out.println("================================");

        System.out.println("Final Pasta List:");
        for (String p : pasta.pastas) {
            System.out.println(p);
        }
    }
}