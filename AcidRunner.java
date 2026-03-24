class AcidRunner {

    public static void main(String[] args) {

        AcidStore store = new AcidStore();

        Acid[] acids = new Acid[10];

        acids[0] = new Acid("Hydrochloric Acid", "HCl", 1, "Strong", 1.0);
        acids[1] = new Acid("Formic Acid", "HCOOH", 1, "Weak", 3.7);
        acids[2] = new Acid("Boric Acid", "H3BO3", 1, "Weak", 5.0);
        acids[3] = new Acid("Acetic Acid", "CH3COOH", 1, "Weak", 3.0);
        acids[4] = new Acid("Citric Acid", "C6H8O7", 1, "Weak", 3.5);
        acids[5] = new Acid("Carbonic Acid", "H2CO3", 1, "Weak", 4.0);
        acids[6] = new Acid("Nitric Acid", "HNO3", 1, "Strong", 1.2);
        acids[7] = new Acid("Phosphoric Acid", "H3PO4", 1, "Medium", 2.1);
        acids[8] = new Acid("Oxalic Acid", "C2H2O4", 1, "Medium", 1.3);
        acids[9] = new Acid("Sulfuric Acid", "H2SO4", 2, "Strong", 0.5);

        for(int i = 0; i < acids.length; i++) {
            store.save(acids[i]);
        }
    }
}