class HammerRunner {

    public static void main(String[] args) {

        char[] grades = new char[3];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'C';

        Material[] materials = new Material[3];

        Material m1 = new Material("Steel", 7);
        Material m2 = new Material("Iron", 5);
        Material m3 = new Material("Titanium", 3);

        materials[0] = m1;
        materials[1] = m2;
        materials[2] = m3;

        Hammer hammer = new Hammer(grades, materials);
        hammer.info();
    }
}