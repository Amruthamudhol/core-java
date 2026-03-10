class CarrotHalwa {

    short[] sweetnessLevels;
    DryFruit[] dryFruitList;

    CarrotHalwa(short[] sweetnessLevels, DryFruit[] dryFruitList) {
        this.sweetnessLevels = sweetnessLevels;
        this.dryFruitList = dryFruitList;
    }

    void info() {

        System.out.println("Sweetness Levels:");

        if (sweetnessLevels != null) {

            System.out.println("Total Levels: " + this.sweetnessLevels.length);

            for (short level : sweetnessLevels) {
                System.out.println("Sweetness: " + level);
            }
        }

        System.out.println("Dry Fruit Details:");

        if (dryFruitList != null) {

            System.out.println("Total Dry Fruits: " + this.dryFruitList.length);

            for (DryFruit df : dryFruitList) {
                df.display();
            }
        }
    }
}