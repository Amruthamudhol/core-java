class ToxicRunner {

    public static void main(String[] args) {

        Toxic t1 = new Toxic("Arsenic","As","Metal","Gray","Odorless","Solid",74.9, 613, 817, 5.7, 9,"Inhalation",
				"Nausea","Dimercaprol","Cool Place","Albertus Magnus", 1250,"Skull",false,"Water Pollution");

        Toxic t2 = new Toxic("Mercury","Hg","Metal","Silver","Odorless","Liquid",
                200.6, 356, -39, 13.5, 8,"Skin Contact",
                "Brain Damage","Chelation","Sealed Container","Ancient",
                1500,"Toxic",false,"Soil Contamination");

        Toxic t3 = new Toxic("Cyanide","CN","Compound","White","Bitter Almond","Solid",
                26.0, 25.6, 634, 1.6, 10,"Ingestion",
                "Respiratory Failure","Hydroxocobalamin","Dry Place","Scheele",
                1782,"Danger",true,"Air Pollution");

        Toxic t4 = new Toxic("Lead","Pb","Metal","Blue-Gray","Odorless","Solid",
                207.2, 1749, 327, 11.3, 7,"Inhalation",
                "Kidney Damage","EDTA","Dry Storage","Ancient",
                1000,"Harmful",false,"Soil Damage");

        Toxic t5 = new Toxic("Chlorine","Cl2","Gas","Green","Pungent","Gas",
                70.9, -34, -101, 3.2, 8,"Inhalation",
                "Lung Irritation","Oxygen","Ventilated Area","Scheele",
                1774,"Corrosive",true,"Water Pollution");

        Toxic t6 = new Toxic("Ammonia","NH3","Gas","Colorless","Sharp","Gas",
                17.0, -33, -78, 0.7, 6,"Inhalation",
                "Eye Irritation","Fresh Air","Cool Storage","Priestley",
                1774,"Warning",true,"Air Pollution");

        Toxic t7 = new Toxic("Formaldehyde","CH2O","Compound","Colorless","Strong","Liquid",
                30.0, -19, -92, 0.8, 7,"Skin Contact",
                "Skin Burns","Water Wash","Cool Place","Hofmann",
                1867,"Toxic",true,"Water Contamination");

        Toxic t8 = new Toxic("Benzene","C6H6","Compound","Colorless","Sweet","Liquid",
                78.1, 80, 5, 0.8, 8,"Inhalation",
                "Cancer Risk","Supportive Care","Sealed Container","Faraday",
                1825,"Flammable",true,"Air Pollution");

        Toxic t9 = new Toxic("Sulfur Dioxide","SO2","Gas","Colorless","Sharp","Gas",
                64.1, -10, -73, 2.9, 7,"Inhalation",
                "Breathing Issues","Fresh Air","Ventilated Area","Priestley",
                1774,"Warning",false,"Acid Rain");

        Toxic t10 = new Toxic("Carbon Monoxide","CO","Gas","Colorless","Odorless","Gas",
                28.0, -191, -205, 1.1, 10,"Inhalation",
                "Death","Oxygen Therapy","Ventilated Area","de Lassone",
                1776,"Danger",true,"Air Pollution");

        t1.showDetails();
        t2.showDetails();
        t3.showDetails();
        t4.showDetails();
        t5.showDetails();
        t6.showDetails();
        t7.showDetails();
        t8.showDetails();
        t9.showDetails();
        t10.showDetails();
    }
}