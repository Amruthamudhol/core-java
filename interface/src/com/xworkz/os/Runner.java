package com.xworkz.os;

import sun.plugin2.os.windows.Windows;

public class Runner {
    public static void main(String[] args) {

        OS windows = new windowsOs();
        Dell dell = new Dell(windows);
        dell.runSystem();


        OS linux = new LinuxOs();
        Dell dell1 = new Dell(linux);
        dell1.runSystem();
    }
}
