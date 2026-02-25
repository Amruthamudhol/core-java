class PawnRunner {

    public static void main(String[] args) {

        Pawn p1 = new Pawn();
        System.out.println(p1.color);
        System.out.println(p1.position);
        System.out.println(p1.material);
        System.out.println(p1.value);
        System.out.println(p1.isActive);
        System.out.println("------------------");

        Pawn p2 = new Pawn("White");
        System.out.println(p2.color);
        System.out.println(p2.position);
        System.out.println(p2.material);
        System.out.println(p2.value);
        System.out.println(p2.isActive);
        System.out.println("------------------");

        Pawn p3 = new Pawn("Black", "A2");
        System.out.println(p3.color);
        System.out.println(p3.position);
        System.out.println(p3.material);
        System.out.println(p3.value);
        System.out.println(p3.isActive);
        System.out.println("------------------");

        Pawn p4 = new Pawn("White", "B3", "Wood");
        System.out.println(p4.color);
        System.out.println(p4.position);
        System.out.println(p4.material);
        System.out.println(p4.value);
        System.out.println(p4.isActive);
        System.out.println("------------------");

        Pawn p5 = new Pawn("Black", "C4", "Plastic", 1);
        System.out.println(p5.color);
        System.out.println(p5.position);
        System.out.println(p5.material);
        System.out.println(p5.value);
        System.out.println(p5.isActive);
        System.out.println("------------------");

        Pawn p6 = new Pawn("White", "D5", "Marble", 1, true);
        System.out.println(p6.color);
        System.out.println(p6.position);
        System.out.println(p6.material);
        System.out.println(p6.value);
        System.out.println(p6.isActive);
        System.out.println("------------------");
    }
}