class Cell {

    String name;
    String type;
    String shape;
    double size;
    String function;
    boolean nucleus;
    boolean prokaryotic;
    String cellWall;
    String cellMembrane;
    String cytoplasm;
    String geneticMaterial;
    int chromosomeCount;
    String mitochondria;
    String ribosomes;
    String golgiApparatus;
    String endoplasmicReticulum;
    String lysosomes;
    String vacuole;
    String reproductionType;
    boolean multicellular;

    Cell(String name, String type, String shape, double size, String function,
         boolean nucleus, boolean prokaryotic, String cellWall,
         String cellMembrane, String cytoplasm, String geneticMaterial,
         int chromosomeCount, String mitochondria, String ribosomes,
         String golgiApparatus, String endoplasmicReticulum, String lysosomes,
         String vacuole, String reproductionType, boolean multicellular) {

        this.name = name;
        this.type = type;
        this.shape = shape;
        this.size = size;
        this.function = function;
        this.nucleus = nucleus;
        this.prokaryotic = prokaryotic;
        this.cellWall = cellWall;
        this.cellMembrane = cellMembrane;
        this.cytoplasm = cytoplasm;
        this.geneticMaterial = geneticMaterial;
        this.chromosomeCount = chromosomeCount;
        this.mitochondria = mitochondria;
        this.ribosomes = ribosomes;
        this.golgiApparatus = golgiApparatus;
        this.endoplasmicReticulum = endoplasmicReticulum;
        this.lysosomes = lysosomes;
        this.vacuole = vacuole;
        this.reproductionType = reproductionType;
        this.multicellular = multicellular;
    }

    void printCellDetails() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Size: " + size);
        System.out.println("Function: " + function);
        System.out.println("Has Nucleus: " + nucleus);
        System.out.println("Is Prokaryotic: " + prokaryotic);
        System.out.println("Cell Wall: " + cellWall);
        System.out.println("Cell Membrane: " + cellMembrane);
        System.out.println("Cytoplasm: " + cytoplasm);
        System.out.println("Genetic Material: " + geneticMaterial);
        System.out.println("Chromosome Count: " + chromosomeCount);
        System.out.println("Mitochondria: " + mitochondria);
        System.out.println("Ribosomes: " + ribosomes);
        System.out.println("Golgi Apparatus: " + golgiApparatus);
        System.out.println("Endoplasmic Reticulum: " + endoplasmicReticulum);
        System.out.println("Lysosomes: " + lysosomes);
        System.out.println("Vacuole: " + vacuole);
        System.out.println("Reproduction Type: " + reproductionType);
        System.out.println("Is Multicellular: " + multicellular);
        System.out.println("-----------------------------------");
    }
}