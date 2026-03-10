class TowerRunner {

    public static void main(String[] args) {

        double[] heights = new double[3];
        heights[0] = 12.5;
        heights[1] = 25.0;
        heights[2] = 37.8;

        Floor[] floors = new Floor[3];

        Floor f1 = new Floor("Ground Floor", 10);
        Floor f2 = new Floor("First Floor", 12);
        Floor f3 = new Floor("Second Floor", 8);

        floors[0] = f1;
        floors[1] = f2;
        floors[2] = f3;

        Tower tower = new Tower(heights, floors);
		tower.info();
    }
}