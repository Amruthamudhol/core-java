class ClothStore {

    Cloth[] cloths = new Cloth[10];
    int index = 0;

    void save(Cloth cloth) {

        if (cloth != null) {

            if (index < cloths.length) {

                cloths[index] = cloth;

                System.out.println("Cloth saved at position " + index);
                cloth.printInfo();

                index++;

            } else 
			{
                System.out.println("Array is full");
            }

        } else 
		{
            System.out.println("Cloth is null");
        }
    }
}