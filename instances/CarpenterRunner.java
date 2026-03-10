class CarpenterRunner {

    public static void main(String[] args) {

        String[] items = new String[3];
        items[0] = "Door";
        items[1] = "Window";
        items[2] = "Shelf";

        Equipment[] tools = new Equipment[3];

        Equipment e1 = new Equipment("Hammer", 4);
        Equipment e2 = new Equipment("Saw", 2);
        Equipment e3 = new Equipment("Drill", 3);

        tools[0] = e1;
        tools[1] = e2;
        tools[2] = e3;

        Carpenter carpenter = new Carpenter(items, tools);

        carpenter.info();
    }
}