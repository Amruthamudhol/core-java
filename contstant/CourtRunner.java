class CourtRunner {
    public static void main(String[] args) {

        Location loc1 = new Location("Delhi");
        Location loc2 = new Location("Mumbai");

        Court c1 = new Court(5, loc1, CaseType.CIVIL);
        Court c2 = new Court(7, loc2, CaseType.CRIMINAL);
        Court c3 = new Court(4, null, CaseType.FAMILY);
        Court c4 = new Court(6, loc1, null);

        c1.printInfo();
        c2.printInfo();
        c3.printInfo();
        c4.printInfo();
    }
}