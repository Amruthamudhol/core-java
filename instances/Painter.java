class Painter {

    String[] paintingNames;
    Color[] colorsUsed;

    Painter(String[] paintingNames, Color[] colorsUsed) {
        this.paintingNames = paintingNames;
        this.colorsUsed = colorsUsed;
    }

    void info() {

        System.out.println("Paintings:");

        if (paintingNames != null) {

            System.out.println("Total Paintings: " + this.paintingNames.length);

            for (String painting : paintingNames) {
                System.out.println("Painting: " + painting);
            }
        }

        System.out.println("Color Details:");

        if (colorsUsed != null) {

            System.out.println("Total Colors: " + this.colorsUsed.length);

            for (Color color : colorsUsed) {
                color.display();
            }
        }
    }
}