class CapStore {

    Cap[] caps = new Cap[10];
    int index = 0;

    void save(Cap cap) {

        if (cap != null && caps != null) {

            if (index < caps.length) {

                int currentIndex = index;
                caps[currentIndex] = cap;

                System.out.println("Cap saved at index: " + currentIndex);

                index++;
				cap.printInfo();

            } else {
                System.out.println("array is full");
            }

        } else {
            System.out.println("Cap is null, cannot save");
        }
    }
}