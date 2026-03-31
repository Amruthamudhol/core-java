class ComputerRunner {

    public static void main(String[] args) {

        Browser browser = new Browser();
        ChromeBrowser chromeBrowser = new ChromeBrowser();
        MobileChromeBrowser mobile = new MobileChromeBrowser();

        Computer computer = new Computer();

       // computer.compute(browser);
        //computer.compute(chromeBrowser);
       computer.compute(mobile);
    }
}