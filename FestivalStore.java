class FestivalStore {

    Festival[] festivals = new Festival[10];
    int index = 0;

    void save(Festival festival) {

        if (festival != null && festivals!=null) {

            if (index < festivals.length) {

                festivals[index] = festival;

                System.out.println("Festival stored successfully");
                System.out.println("Position: " + index);
                festival.printInfo();

                index++;

            } else {
                System.out.println("No space available in array");
            }

        } else {
            System.out.println("Cannot store null festival");
        }
    }
}