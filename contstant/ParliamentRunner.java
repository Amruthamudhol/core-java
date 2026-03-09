class ParliamentRunner{
	public static void main(String[] value){
		Country country=new Country("India");
		Parliament parliament=new Parliament(500,country,House.RAJYASABHA);
		Country country1=new Country("Pakistan");
		Parliament parliament1=new Parliament(400,country1,House.LOKSABHA);
		Country country2=new Country("Isrel");
		Parliament parliament2=new Parliament(250,country2,House.SPEAKER);
		Country country3=new Country("Iran");
		Parliament parliament3=new Parliament(350,country3,House.PRESIDENT);
		parliament.printDetails();
		parliament1.printDetails();
		parliament2.printDetails();
		parliament3.printDetails();
	}
}