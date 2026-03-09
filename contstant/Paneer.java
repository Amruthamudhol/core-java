class Paneer {
    double fatContent;
    Dairy dairy;
    PaneerTexture texture;

    Paneer(double fatContent, Dairy dairy, PaneerTexture texture) {
        this.fatContent = fatContent;
        this.dairy = dairy;
        this.texture = texture;
    }

    void printInfo() {
        System.out.println("Fat Content: " + this.fatContent);

        if (this.dairy != null) {
            System.out.println("Dairy Name: " + this.dairy.name);
        } else {
            System.out.println("Dairy is null");
        }

        if (this.texture != null) {
            System.out.println("Paneer Texture: " + this.texture);
        } else {
            System.out.println("Paneer Texture is null");
        }

        System.out.println("-----------------------");
    }
}