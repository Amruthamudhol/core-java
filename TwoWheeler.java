class TwoWheeler {

    String[] models;
    int currentIndex = 0;

    void storeModel(String modelName) {

        System.out.println("Running storeModel method");
        System.out.println("modelName:" + modelName);

        if (this.models != null) {

            System.out.println("Array is not null");

            if (currentIndex < models.length) {

                System.out.println("Index is within array length");

                models[currentIndex] = modelName;
                System.out.println(modelName + " stored at index " + currentIndex);

                currentIndex++;

                System.out.println("Next index value is: " + currentIndex);

            } 
            else {
                System.out.println("Array is full");
            }

        } 
        else {
            System.out.println("Array is null");
        }
    }
}