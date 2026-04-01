class StairCaseRunner {
    public static void main(String[] args) {

        ModernStairCase s1 =  new ModernStairCase(15, "Wood", true, 10.5, 'A', 500);

        ModernStairCase s2 = new ModernStairCase(20, "Steel", true, 12.0, 'B', 800);

        ModernStairCase s3 = new ModernStairCase(10, "Concrete", false, 8.5, 'A', 1000);

        s1.display();
        s2.display();
        s3.display();
    }
}