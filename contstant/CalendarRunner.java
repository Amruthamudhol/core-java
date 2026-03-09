class CalendarRunner {
    public static void main(String[] args) {

        Company c1 = new Company("TimePrint");
        Company c2 = new Company("DailyDates");

        Calendar cal1 = new Calendar(2024, c1, CalendarType.WALL);
        Calendar cal2 = new Calendar(2025, c2, CalendarType.DESK);
        Calendar cal3 = new Calendar(2023, null, CalendarType.DIGITAL);
        Calendar cal4 = new Calendar(2026, c1, CalendarType.POCKET);

        cal1.printInfo();
        cal2.printInfo();
        cal3.printInfo();
        cal4.printInfo();
    }
}