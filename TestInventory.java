class TestInventory {

    public static void main(String[] args) {

        InventoryManager p1 = new InventoryManager(1, "Laptop", 50, 5, 50000, 4, false);
        InventoryManager p2 = new InventoryManager(2, "Fan", 15, 3, 2000, 5, true);
        InventoryManager p3 = new InventoryManager(3, "Mobile", 5, 4, 15000, 3, false);
        InventoryManager p4 = new InventoryManager(4, "AC", 25, 2, 35000, 6, true);

        System.out.println(p1.productName + ": " + p1.checkStockStatus());
        System.out.println(p2.productName + ": " + p2.checkStockStatus());
        System.out.println(p3.productName + ": " + p3.checkStockStatus());
        System.out.println(p4.productName + ": " + p4.checkStockStatus());

        System.out.println("Average Inventory Value: " + 
                InventoryManager.getAverageInventoryValue());

        System.out.println("Laptop Weekly Revenue: " + p1.calculateWeeklyRevenue());
        System.out.println("Fan Weekly Revenue: " + p2.calculateWeeklyRevenue());
        System.out.println("Mobile Weekly Revenue: " + p3.calculateWeeklyRevenue());
        System.out.println("AC Weekly Revenue: " + p4.calculateWeeklyRevenue());
        p3.restock(20);

        System.out.println("After Restock - Mobile Stock Status: " + 
                p3.checkStockStatus());
    }
}