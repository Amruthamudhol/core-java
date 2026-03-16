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
		System.out.println("----------------------");
    }

	boolean searchModel(String searchName) {

    System.out.println("Running searchModel method");
    System.out.println("Searching for: " + searchName);

    if (models != null) {

        System.out.println("Array is not null, starting comparison...");

        for (String model : models) {

            System.out.println("Comparing model: " + model + " with searchName: " + searchName);

            if (model != null && model == searchName) {
                System.out.println("Match found! Model: " + model + " is equal to " + searchName);
                return true;
            }
            else {
                System.out.println("No match for this model");
            }
        }

        System.out.println("Model not found in the array");
    } 
    else {
        System.out.println("Array is null, cannot perform search");
    }

    return false;
	}
}