class TwoWheeler {

    String[] models;
    int currentIndex = 0;

    // STORE
    void storeModel(String modelName) {

        System.out.println("Running storeModel method");
        System.out.println("Model Name: " + modelName);

        if (models != null) {

            if (currentIndex < models.length) {

                models[currentIndex] = modelName;
                System.out.println(modelName + " stored at index " + currentIndex);

                currentIndex++;

            } else {
                System.out.println("Array is full");
            }

        } else {
            System.out.println("Array is null");
        }

        System.out.println("----------------------");
    }

    // SEARCH (FIXED)
    boolean searchModel(String searchName) {

        System.out.println("Running searchModel method");
        System.out.println("Searching for: " + searchName);

        if (models != null) {

            for (String model : models) {

                System.out.println("Checking: " + model);

                if (model != null && model.equals(searchName)) {
                    System.out.println("Match found: " + model);
                    System.out.println("----------------------");
                    return true;
                }
            }
        }

        System.out.println("Model not found");
        System.out.println("----------------------");
        return false;
    }

    // UPDATE BY INDEX
    boolean updateModel(int index, String newName) {

        System.out.println("Running updateModel by index");

        if (models != null && index >= 0 && index < currentIndex) {

            System.out.println("Old Model: " + models[index]);

            models[index] = newName;

            System.out.println("Updated to: " + newName);
            System.out.println("----------------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("----------------------");
        return false;
    }

    // UPDATE BY NAME
    boolean updateModel(String oldName, String newName) {

        System.out.println("Running updateModel by name");

        if (models != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + models[i]);

                if (models[i] != null && models[i].equals(oldName)) {

                    System.out.println("Match found at index: " + i);

                    models[i] = newName;

                    System.out.println("Updated to: " + newName);
                    System.out.println("----------------------");
                    return true;
                }
            }
        }

        System.out.println("Model not found");
        System.out.println("----------------------");
        return false;
    }

    // DELETE BY INDEX
    boolean deleteModel(int index) {

        System.out.println("Running deleteModel by index");

        if (models != null && index >= 0 && index < currentIndex) {

            System.out.println("Deleting: " + models[index]);

            models[index] = null;

            System.out.println("Deleted successfully");
            System.out.println("----------------------");
            return true;
        }

        System.out.println("Invalid index");
        System.out.println("----------------------");
        return false;
    }

    // DELETE BY NAME
    boolean deleteModel(String name) {

        System.out.println("Running deleteModel by name");

        if (models != null) {

            for (int i = 0; i < currentIndex; i++) {

                System.out.println("Checking: " + models[i]);

                if (models[i] != null && models[i].equals(name)) {

                    System.out.println("Match found at index: " + i);

                    models[i] = null;

                    System.out.println("Deleted successfully");
                    System.out.println("----------------------");
                    return true;
                }
            }
        }

        System.out.println("Model not found");
        System.out.println("----------------------");
        return false;
    }
}