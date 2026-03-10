class PainterRunner {

    public static void main(String[] args) {

        String[] paintings = new String[3];
        paintings[0] = "Monalisa";
        paintings[1] = "Girl with a Pearl Earring";
        paintings[2] = "The Last Supper";

        Color[] colors = new Color[3];

        Color c1 = new Color("violet", 50);
        Color c2 = new Color("Purple", 45);
        Color c3 = new Color("Green", 36);

        colors[0] = c1;
        colors[1] = c2;
        colors[2] = c3;

        Painter painter = new Painter(paintings, colors);

        painter.info();
    }
}