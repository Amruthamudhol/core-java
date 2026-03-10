class Tower {

    double[] heightLevels;
    Floor[] floor;

    Tower(double[] heightLevels, Floor[] floor) {
        this.heightLevels = heightLevels;
        this.floor = floor;
    }

    void info() {

        System.out.println("Tower Height Levels:");

        if (heightLevels != null) {

            System.out.println("Total Height Entries: " + this.heightLevels.length);

            for (double height : heightLevels) {
                System.out.println("Height: " + height);
            }
        }

        System.out.println("Floor Details:");

        if (floor!= null) {

            System.out.println("Total Floors: " + this.floor.length);

            for (Floor floors : floor) {
                floors.display();
            }
        }
    }
}