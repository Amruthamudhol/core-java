class CellRunner {

    public static void main(String[] args) {

        Cell c1 = new Cell("Animal Cell","Eukaryotic","Round",10.5,"Support life",
                true,false,"Absent","Present","Present","DNA",
                46,"Present","Present","Present","Present","Present",
                "Small","Mitosis",true);

        Cell c2 = new Cell("Plant Cell","Eukaryotic","Rectangular",20.0,"Photosynthesis",
                true,false,"Present","Present","Present","DNA",
                20,"Present","Present","Present","Present","Present",
                "Large","Mitosis",true);

        Cell c3 = new Cell("Bacterial Cell","Prokaryotic","Rod",5.0,"Reproduction",
                false,true,"Present","Present","Present","DNA",
                1,"Absent","Present","Absent","Absent","Absent",
                "Absent","Binary Fission",false);

        Cell c4 = new Cell("Fungal Cell","Eukaryotic","Oval",8.0,"Decomposition",
                true,false,"Present","Present","Present","DNA",
                10,"Present","Present","Present","Present","Present",
                "Small","Mitosis",true);

        Cell c5 = new Cell("Nerve Cell","Eukaryotic","Long",15.0,"Transmit signals",
                true,false,"Absent","Present","Present","DNA",
                46,"Present","Present","Present","Present","Present",
                "Small","Mitosis",true);

        Cell c6 = new Cell("Muscle Cell","Eukaryotic","Fiber",12.0,"Movement",
                true,false,"Absent","Present","Present","DNA",
                46,"Present","Present","Present","Present","Present",
                "Small","Mitosis",true);

        Cell c7 = new Cell("Blood Cell","Eukaryotic","Round",7.5,"Carry oxygen",
                false,false,"Absent","Present","Present","DNA",
                0,"Absent","Present","Absent","Absent","Absent",
                "Absent","Mitosis",true);

        Cell c8 = new Cell("Stem Cell","Eukaryotic","Round",9.0,"Regeneration",
                true,false,"Absent","Present","Present","DNA",
                46,"Present","Present","Present","Present","Present",
                "Small","Mitosis",true);

        Cell c9 = new Cell("Skin Cell","Eukaryotic","Flat",11.0,"Protection",
                true,false,"Absent","Present","Present","DNA",
                46,"Present","Present","Present","Present","Present",
                "Small","Mitosis",true);

        Cell c10 = new Cell("Egg Cell","Eukaryotic","Round",18.0,"Reproduction",
                true,false,"Absent","Present","Present","DNA",
                23,"Present","Present","Present","Present","Present",
                "Large","Meiosis",true);

        c1.printCellDetails();
        c2.printCellDetails();
        c3.printCellDetails();
        c4.printCellDetails();
        c5.printCellDetails();
        c6.printCellDetails();
        c7.printCellDetails();
        c8.printCellDetails();
        c9.printCellDetails();
        c10.printCellDetails();
    }
}