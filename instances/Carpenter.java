class Carpenter {

    String[] woodItems;
    Equipment[] equipmentList;

    Carpenter(String[] woodItems, Equipment[] equipmentList) {
        this.woodItems = woodItems;
        this.equipmentList = equipmentList;
    }

    void info() {

        System.out.println("Wood Items:");

        if (woodItems != null) {

            System.out.println("Total Items: " + this.woodItems.length);

            for (String item : woodItems) {
                System.out.println("Item: " + item);
            }
        }

        System.out.println("Equipment Details:");

        if (equipmentList != null) {

            System.out.println("Total Equipment: " +  this.equipmentList.length);

            for (Equipment equip : equipmentList) {
                equip.display();
            }
        }
    }
}