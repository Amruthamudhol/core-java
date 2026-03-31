class Computer {

    void compute(Browser browser) {
        System.out.println("Running compute in Computer...");

        if (browser!= null) {
            browser.open();
        }

        if (browser instanceof MobileChromeBrowser) {
            MobileChromeBrowser mobile = (MobileChromeBrowser) browser;
            mobile.reopen();
           
        }

        if (browser instanceof ChromeBrowser) {
            ChromeBrowser chrome = (ChromeBrowser) browser;
            chrome.close();
            
        }
		

        
    }
}