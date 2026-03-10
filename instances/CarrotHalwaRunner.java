class CarrotHalwaRunner {

    public static void main(String[] args) {

        short[] sweetness = new short[3];
        sweetness[0] = 5;
        sweetness[1] = 7;
        sweetness[2] = 9;

        DryFruit[] fruits = new DryFruit[3];

        DryFruit f1 = new DryFruit("Cashew", 2);
        DryFruit f2 = new DryFruit("Almond", 3);
        DryFruit f3 = new DryFruit("Raisin", 4);

        fruits[0] = f1;
        fruits[1] = f2;
        fruits[2] = f3;

        CarrotHalwa halwa = new CarrotHalwa(sweetness, fruits);
		halwa.info();
    }
}