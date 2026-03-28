class GenderRunner {

    public static void main(String[] args) {

        GenderStore store = new GenderStore();

        System.out.println("Before Sorting");
        store.display();

        store.sortAsc();
        store.display();

        store.sortDesc();
        store.display();
    }
}