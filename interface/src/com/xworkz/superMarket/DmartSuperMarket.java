package com.xworkz.superMarket;

public class DmartSuperMarket implements SuperMarket {

    @Override
    public void purchase() {
        System.out.println("executing purchase in DmartSuperMarket");
    }

    @Override
    public void discount() {
        System.out.println("executing discount in DmartSuperMarket");
    }
}