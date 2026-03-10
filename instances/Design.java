class Design {

    String designName;
    int colorCount;

    Design(String designName, int colorCount) {
        this.designName = designName;
        this.colorCount = colorCount;
    }

    void display() {
        System.out.println("Design: " + this.designName + " Colors Used: " + this.colorCount);
    }
}