package com.xworkz.datetime.runner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateRunner{

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);
        System.out.println("Add 5 Days: " + date.plusDays(5));
        System.out.println("Subtract 3 Days: " + date.minusDays(3));
        System.out.println("Add 2 Months: " + date.plusMonths(2));
        System.out.println("Subtract 1 Year: " + date.minusYears(1));
        System.out.println("Day of Month: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        System.out.println("Is Leap Year: " + date.isLeapYear());

        System.out.println("---------------");

        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);
        System.out.println("Add 2 Hours: " + time.plusHours(2));
        System.out.println("Subtract 30 Minutes: " + time.minusMinutes(30));
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());

        System.out.println("--------------------------------");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + dateTime);
        System.out.println("Add 4 Days: " + dateTime.plusDays(4));
        System.out.println("Subtract 5 Hours: " + dateTime.minusHours(5));
        System.out.println("Add 2 Weeks: " + dateTime.plusWeeks(2));
        System.out.println("Day of Week: " + dateTime.getDayOfWeek());
        System.out.println("Month Value: " + dateTime.getMonthValue());
    }
}