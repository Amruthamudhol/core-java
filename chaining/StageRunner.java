class  StageRunner {
    public static void main(String[] args) {

        PerformanceStage s1 = new PerformanceStage(1, "Main Stage", true, 2500.5, 'A', 5000);

        PerformanceStage s2 = new PerformanceStage(2, "Indoor Hall", false, 1200.75, 'B', 2000);

        PerformanceStage s3 =  new PerformanceStage(3, "Open Arena", true, 3200.0, 'A', 8000);

        s1.display();
        s2.display();
        s3.display();
    }
}