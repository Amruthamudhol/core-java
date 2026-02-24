class AntRunner {

    public static void main(String[] args) {

        Ant ant = new Ant("Worker", "Black", 6);

        System.out.println("Ant type: " + ant.type);
        System.out.println("Ant color: " + ant.color);
        System.out.println("Ant legs: " + ant.legs);
    }
}