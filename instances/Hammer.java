class Hammer {

    char[] hammerGrades;
    Material[] materialList;

    Hammer(char[] hammerGrades, Material[] materialList) {
        this.hammerGrades = hammerGrades;
        this.materialList = materialList;
    }

    void info() {

        System.out.println("Hammer Grades:");

        if (hammerGrades != null) {

            System.out.println("Total Grades: " + this.hammerGrades.length);

            for (char grade : hammerGrades) {
                System.out.println("Grade: " + grade);
            }
        }

        System.out.println("Material Details:");

        if (materialList != null) {

            System.out.println("Total Materials: " + this.materialList.length);

            for (Material mat : materialList) {
                mat.display();
            }
        }
    }
}