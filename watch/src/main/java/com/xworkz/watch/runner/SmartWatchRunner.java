package com.xworkz.watch.runner;

import com.xworkz.watch.dto.SmartWatchDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SmartWatchRunner {
    public static void main(String[] args) {
        List<SmartWatchDTO> smartWatchDTOs = new ArrayList<>();

        //add() Operations
        smartWatchDTOs.add(new SmartWatchDTO("Apple", "Watch Series 9", "Black", 45.0, true, true, 18, 45999.0, "watchOS", LocalDate.of(2023, 9, 22)));

        smartWatchDTOs.add(new SmartWatchDTO("Samsung", "Galaxy Watch 6", "Silver", 44.0, true, true, 16, 32999.0, "Wear OS", LocalDate.of(2023, 8, 11)));
        smartWatchDTOs.add(new SmartWatchDTO("Garmin", "Venu 3", "Blue", 45.0, true, true, 14, 38999.0, "Garmin OS", LocalDate.of(2023, 10, 1)));
        smartWatchDTOs.add(new SmartWatchDTO("Fitbit", "Sense 2", "White", 40.0, true, true, 6, 24999.0, "Fitbit OS", LocalDate.of(2022, 9, 23)));
        smartWatchDTOs.add(new SmartWatchDTO("Amazfit", "GTR 4", "Green", 46.0, true, true, 12, 18999.0, "Zepp OS", LocalDate.of(2022, 8, 25)));
        smartWatchDTOs.add(new SmartWatchDTO("Huawei", "Watch GT 4", "Brown", 46.0, true, true, 14, 21999.0, "HarmonyOS", LocalDate.of(2023, 9, 14)));

        // o index
        smartWatchDTOs.add(0, new SmartWatchDTO("Noise", "ColorFit Pro 5", "Black", 42.0, true, true, 7, 4999.0, "Noise OS", LocalDate.of(2024, 1, 10)));

        //last position
        smartWatchDTOs.add(new SmartWatchDTO("OnePlus", "Watch 2", "Silver", 47.0, true, true, 12, 24999.0, "Wear OS", LocalDate.of(2024, 2, 26)));

         //2nd index
        smartWatchDTOs.add(2, new SmartWatchDTO("Fossil", "Gen 6", "Gold", 44.0, true, true, 5, 17999.0, "Wear OS", LocalDate.of(2022, 3, 15)));

        System.out.println("SmartWatches:");
        System.out.println("\nAfter add() Operations");
        for (SmartWatchDTO smartWatch : smartWatchDTOs) {
            System.out.println(smartWatch);
        }
        System.out.println("-------");

        //addAll()

        List<SmartWatchDTO> secondList = new ArrayList<>();
        secondList.add(new SmartWatchDTO("Apple", "Watch SE", "Black", 44.0, true, true, 18, 29999.0, "watchOS", LocalDate.of(2023, 9, 15)));
        secondList.add(new SmartWatchDTO("Samsung", "Galaxy Watch 5", "Silver", 44.0, true, true, 15, 24999.0, "Wear OS", LocalDate.of(2022, 8, 10)));
        secondList.add(new SmartWatchDTO("Garmin", "Forerunner 265", "Blue", 46.0, true, true, 13, 39999.0, "Garmin OS", LocalDate.of(2023, 3, 2)));

        smartWatchDTOs.addAll(secondList);
        System.out.println("\nAfter addAll(secondList)");
        System.out.println("Size : " + smartWatchDTOs.size());
        for (SmartWatchDTO watch : smartWatchDTOs) {
            System.out.println(watch);
        }


        // Create another list
        List<SmartWatchDTO> anotherList = new ArrayList<>();
        anotherList.add(new SmartWatchDTO("Noise", "ColorFit Ultra", "Black", 42.0, true, true, 7, 5999.0, "Noise OS", LocalDate.of(2024, 1, 5)));
        anotherList.add(new SmartWatchDTO("Boat", "Xtend", "Blue", 44.0, false, true, 8, 3499.0, "Boat OS", LocalDate.of(2023, 11, 20)));

        // Insert at index 2
        smartWatchDTOs.addAll(2, anotherList);
        System.out.println("\nAfter addAll(2, anotherList)");
        System.out.println("Size : " + smartWatchDTOs.size());
        for (SmartWatchDTO watch : smartWatchDTOs) {
            System.out.println(watch);
        }

        System.out.println("----");


        List<SmartWatchDTO> gpsEnabledWatches = new ArrayList<>();
        Iterator<SmartWatchDTO> iterator = smartWatchDTOs.iterator();
        while (iterator.hasNext()) {
            SmartWatchDTO watch = iterator.next();
            if (watch.isHasGPS()) {
                gpsEnabledWatches.add(watch);
            }
        }

         // Add all GPS-enabled watches to another list
        List<SmartWatchDTO> destinationList = new ArrayList<>();
        destinationList.addAll(gpsEnabledWatches);
        System.out.println("GPS Enabled Watches:");
        for (SmartWatchDTO watch : destinationList) {
            System.out.println(watch);
        }
        System.out.println("======");

        smartWatchDTOs.addAll(secondList);
        System.out.println("After combining secondList with smartWatchDTOs:");
        for (SmartWatchDTO watch : smartWatchDTOs) {
            System.out.println(watch);
        }
        System.out.println("-------");

        // Add all watches from smartWatchDTOs to the empty list
        List<SmartWatchDTO> emptyList = new ArrayList<>();
        emptyList.addAll(smartWatchDTOs);
        System.out.println("Watches in Empty List after addAll():");
        System.out.println("Size : " + smartWatchDTOs.size());
        for (SmartWatchDTO watch : emptyList) {
            System.out.println(watch);
        }
        System.out.println("******");


        //contains() Operations
        boolean found = false;
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.getBrand().equalsIgnoreCase("Apple")) {
                found = true;
                break;
            }
        }
        System.out.println("Contains Apple Brand: " + found);

        boolean found1 = false;
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.getModel().equalsIgnoreCase("Series 7")) {
                found1 = true;
                break;
            }
        }

        System.out.println("Contains Model Series 7: " + found1);


        boolean found2 = false;
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.getPrice() > 50000) {
                found2 = true;
                break;
            }
        }
        System.out.println("Price greater than 50000: " + found2);

        boolean found3 = false;
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.getColor().equalsIgnoreCase("Black")) {
                found3= true;
                break;
            }
        }
        System.out.println("Contains Black Color: " + found3);

        boolean found4= false;
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.getDisplaySize() == 1.5) {
                found4 = true;
                break;
            }
        }
        System.out.println("Contains Display Size 1.5: " + found4);
        System.out.println("--------");

        //containsAll()
        List<SmartWatchDTO> appleWatches = new ArrayList<>();
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.getBrand().equalsIgnoreCase("Apple")) {
                appleWatches.add(watch);
            }
        }
        System.out.println(smartWatchDTOs.containsAll(appleWatches));


        List<SmartWatchDTO> gpsWatches = new ArrayList<>();
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.isHasGPS()) {
                gpsWatches.add(watch);
            }
        }
        System.out.println(smartWatchDTOs.containsAll(gpsWatches));

        List<SmartWatchDTO> predefinedList = new ArrayList<>();
        predefinedList.add(smartWatchDTOs.get(0));
        predefinedList.add(smartWatchDTOs.get(2));
        predefinedList.add(smartWatchDTOs.get(4));
        System.out.println(smartWatchDTOs.containsAll(predefinedList));

        List<SmartWatchDTO> batteryList = new ArrayList<>();
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.getBatteryLifeDays() > 5) {
                batteryList.add(watch);
            }
        }
        System.out.println(smartWatchDTOs.containsAll(batteryList));


        List<SmartWatchDTO> watchOSList = new ArrayList<>();
        for (SmartWatchDTO watch : smartWatchDTOs) {
            if (watch.getOperatingSystem().equalsIgnoreCase("watchOS")) {
                watchOSList.add(watch);
            }
        }
        System.out.println(smartWatchDTOs.containsAll(watchOSList));
        System.out.println("=====");

        //itrator
        ListIterator<SmartWatchDTO> iterator1 = smartWatchDTOs.listIterator();
        while (iterator1.hasNext()) {
            SmartWatchDTO watch = iterator1.next();
            System.out.println(watch.getBrand());
        }

        ListIterator<SmartWatchDTO> iterator2 = smartWatchDTOs.listIterator();
        while (iterator2.hasNext()) {
            SmartWatchDTO watch = iterator2.next();
            if (watch.isHasGPS()) {
                System.out.println("First GPS Enabled Watch:");
                System.out.println(watch);
                break;
            }
        }

        ListIterator<SmartWatchDTO> iterator3 = smartWatchDTOs.listIterator();
        int count = 0;
        while (iterator3.hasNext()) {
            SmartWatchDTO watch = iterator3.next();
            if (watch.isHasHeartRateMonitor()) {
                count++;
            }
        }
        System.out.println("Heart Rate Monitor Watches: " + count);

        ListIterator<SmartWatchDTO> iterator4 = smartWatchDTOs.listIterator();
        double totalPrice = 0;
        while (iterator4.hasNext()) {
            SmartWatchDTO watch = iterator4.next();
            totalPrice += watch.getPrice();
        }
        System.out.println("Total Price: " + totalPrice);

        ListIterator<SmartWatchDTO> iterator5 = smartWatchDTOs.listIterator();
        SmartWatchDTO maxDisplayWatch = null;
        while (iterator5.hasNext()) {
            SmartWatchDTO watch = iterator5.next();
            if (maxDisplayWatch == null || watch.getDisplaySize() > maxDisplayWatch.getDisplaySize()) {
                maxDisplayWatch = watch;
            }
        }

        System.out.println("Watch with Maximum Display Size:");
        System.out.println(maxDisplayWatch);


        ListIterator<SmartWatchDTO> iterator6 = smartWatchDTOs.listIterator(smartWatchDTOs.size());
        while (iterator6.hasPrevious()) {
            SmartWatchDTO watch = iterator6.previous();
            System.out.println(watch.getModel());
        }


        ListIterator<SmartWatchDTO> iterator7 = smartWatchDTOs.listIterator(smartWatchDTOs.size());
        while (iterator7.hasPrevious()) {
            SmartWatchDTO watch = iterator7.previous();
            if (watch.getColor().equalsIgnoreCase("Black")) {
                System.out.println("Last Black Watch:");
                System.out.println(watch);
                break;
            }
        }

        ListIterator<SmartWatchDTO> iterator8 = smartWatchDTOs.listIterator(smartWatchDTOs.size());
        int count1 = 0;
        while (iterator8.hasPrevious()) {
            SmartWatchDTO watch = iterator8.previous();
            if (watch.getOperatingSystem().equalsIgnoreCase("Android")) {
                count1++;
            }
        }

        System.out.println("Android Watches: " + count1);

        ListIterator<SmartWatchDTO> iterator9 = smartWatchDTOs.listIterator(smartWatchDTOs.size());
        SmartWatchDTO expensiveWatch = null;

        while (iterator9.hasPrevious()) {
            SmartWatchDTO watch = iterator9.previous();
            if (expensiveWatch == null || watch.getPrice() > expensiveWatch.getPrice()) {
                expensiveWatch = watch;
            }
        }
        System.out.println("Most Expensive Watch:");
        System.out.println(expensiveWatch);
        System.out.println("-----");

        ListIterator<SmartWatchDTO> iterator10 = smartWatchDTOs.listIterator(smartWatchDTOs.size());
        System.out.println("Watches with Battery Life > 10 Days:");
        while (iterator10.hasPrevious()) {
            SmartWatchDTO watch = iterator10.previous();
            if (watch.getBatteryLifeDays() > 10) {
                System.out.println(watch);
            }
        }
        System.out.println("=======");


        ListIterator<SmartWatchDTO> iterator11 = smartWatchDTOs.listIterator(2);
        System.out.println("Forward Traversal from Index 2:");
        while (iterator11.hasNext()) {
            SmartWatchDTO watch = iterator11.next();
            System.out.println(watch);
        }
        System.out.println("---");

        ListIterator<SmartWatchDTO> iterator12 = smartWatchDTOs.listIterator(3);
        System.out.println("Backward Traversal from Index 3:");
        while (iterator12.hasPrevious()) {
            SmartWatchDTO watch = iterator12.previous();
            System.out.println(watch);
        }
        System.out.println("*****");


        //combined
        SmartWatchDTO watch = new SmartWatchDTO("Apple", "Watch SE", "Black", 44.0, true, true, 18, 29999.0, "watchOS", LocalDate.of(2023, 9, 15));
        smartWatchDTOs.add(watch);
        if (smartWatchDTOs.contains(watch)) {
            System.out.println("Watch Found");
            smartWatchDTOs.remove(watch);
            System.out.println("Watch Removed");
        }
        System.out.println(smartWatchDTOs);
        System.out.println("=====");


        smartWatchDTOs.addAll(secondList);
        Iterator<SmartWatchDTO> iterator13 = smartWatchDTOs.iterator();
        while (iterator13.hasNext()) {
            SmartWatchDTO watch1 = iterator13.next();
            if (watch1.getBrand().equalsIgnoreCase("Apple")) {
                iterator13.remove();
            }
        }
        System.out.println("After Removing Apple Watches");

        for (SmartWatchDTO watch1 : smartWatchDTOs) {
            System.out.println(watch1);
        }
        System.out.println("===");


        if (smartWatchDTOs.containsAll(secondList)) {
            System.out.println("All watches are present.");
            smartWatchDTOs.removeAll(secondList);
            System.out.println("secondList removed successfully.");
        }
        for (SmartWatchDTO watch2 : smartWatchDTOs) {
            System.out.println(watch2);
        }
        System.out.println("===");


        smartWatchDTOs.addAll(secondList);
        SmartWatchDTO searchWatch = secondList.get(0);
        if (smartWatchDTOs.contains(searchWatch)) {
            System.out.println("Watch Found");
            smartWatchDTOs.remove(searchWatch);
            System.out.println("Watch Removed");
        }
        for (SmartWatchDTO watch3: smartWatchDTOs) {
            System.out.println(watch3);
        }
    }
}
