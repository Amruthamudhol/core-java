class InventoryManager {

    static int totalProductsTracked = 0;
    static double totalInventoryValue = 0.0;

    int productId;
    String productName;
    int currentStock;
    int dailySalesRate;
    double unitPrice;
    int leadTimeDays;
    boolean isSeasonal;

    InventoryManager(int productId, String productName, int currentStock,
                     int dailySalesRate, double unitPrice,
                     int leadTimeDays, boolean isSeasonal) {

        this.productId = productId;
        this.productName = productName;
        this.currentStock = currentStock;
        this.dailySalesRate = dailySalesRate;
        this.unitPrice = unitPrice;
        this.leadTimeDays = leadTimeDays;
        this.isSeasonal = isSeasonal;

        totalProductsTracked++;
        totalInventoryValue += currentStock * unitPrice;
    }


    static double getAverageInventoryValue() {
        if (totalProductsTracked == 0) {
            return 0;
        }
        return totalInventoryValue / totalProductsTracked;
    }

    int calculateReorderPoint() {

        int reorderPoint = (int)(dailySalesRate * leadTimeDays * 1.5);

        if (isSeasonal) {
            reorderPoint = (int)(reorderPoint * 1.3);
        }

        if (currentStock < 20) {
            reorderPoint += 10;
        }

        return reorderPoint;
    }

    String checkStockStatus() {

        int reorderPoint = calculateReorderPoint();

        if (currentStock <= 0) {
            return "OUT OF STOCK - URGENT";
        }
        else if (currentStock <= reorderPoint) {
            int orderQty = (reorderPoint * 2) - currentStock;
            return "REORDER NEEDED - Order " + orderQty + " units";
        }
        else if (currentStock <= reorderPoint * 1.5) {
            return "LOW STOCK - Monitor closely";
        }
        else {
            return "HEALTHY STOCK";
        }
    }

    double calculateWeeklyRevenue() {

        int workingDays = 7;
        int day = 1;
        int tempStock = currentStock;
        int unitsSold = 0;

        while (day <= workingDays && tempStock > 0) {

            if (tempStock >= dailySalesRate) {
                unitsSold += dailySalesRate;
                tempStock -= dailySalesRate;
            } else {
                unitsSold += tempStock;
                tempStock = 0;
            }

            day++;
        }

        return unitsSold * unitPrice;
    }


    void restock(int unitsReceived) {

        currentStock += unitsReceived;
        totalInventoryValue += unitsReceived * unitPrice;

        System.out.println("Restocked: " + unitsReceived + 
                           " units of " + productName);
    }
}