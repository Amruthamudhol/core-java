class MapStore {

    Map[] maps = new Map[10];
    int index = 0;

    void save(Map map) {

        if (map != null && maps != null) {

            if (index < maps.length) {

                int currentIndex = index;
                maps[currentIndex] = map;

                System.out.print("Map saved at index: " + currentIndex + " -> ");

                index++;
                map.printInfo();

            } else {
                System.out.println("Array is full");
            }

        } else {
            System.out.println("Map is null, cannot save");
        }
    }
}