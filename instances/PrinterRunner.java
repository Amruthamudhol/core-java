class PrinterRunner {

    public static void main(String[] args) {

        String[] docs = new String[3];
		docs[0]="image.png";
		docs[1]="pdf";
		docs[2]="word";
		
		Ink[] inks = new Ink[3];	
		Ink inks1 = new Ink("Black", 50);
		Ink inks2 = new Ink("Cyan", 40);
		Ink inks3 = new Ink("Magenta", 30);

		inks[0] = inks1;
		inks[1] = inks2;
		inks[2] = inks3;
		Printer printer=new Printer(docs,inks);
		printer.info();

	  
       
    }
}