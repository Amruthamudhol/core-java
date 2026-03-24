class CapRunner {

    public static void main(String[] args) {

        CapStore store = new CapStore();

        Cap[] caps = new Cap[10];

        caps[0] = new Cap("Fila", "Brown", "Cotton", "s", 2);
        caps[1] = new Cap("Nike", "White", "Leather", "L", 3);
        caps[2] = new Cap("Puma", "Blue", "Cotton", "M", 3);
        caps[3] = new Cap("Reebok", "Black", "Wool", "S", 6);
        caps[4] = new Cap("UnderArmour", "Pink","Polyester",  "S",7);
        caps[5] = new Cap("Gucci", "Grey", "Cotton", "M", 12);
        caps[6] = new Cap("Levis", "Black", "Denim", "M",6);
        caps[7] = new Cap("Zara", "Pink", "Cotton", "L",3);
        caps[8] = new Cap("Adidas", "Purple", "Polyester", "L", 6);
        caps[9] = new Cap("H&M", "Red", "Green", "L", 24);

        store.save(caps[0]);
        store.save(caps[1]);
        store.save(caps[2]);
        store.save(caps[3]);
        store.save(caps[4]);
        store.save(caps[5]);
        store.save(caps[6]);
        store.save(caps[7]);
        store.save(caps[8]);
        store.save(caps[9]);
    }
}
	  
	  
	  
	  
		 
	
