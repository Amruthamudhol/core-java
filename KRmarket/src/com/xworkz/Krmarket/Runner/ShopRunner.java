package com.xworkz.Krmarket.Runner;

import com.xworkz.Krmarket.Shop.Shop;
import com.xworkz.Krmarket.Shop.impl.Invest;
import com.xworkz.Krmarket.Shop.impl.Vegetableimpl;

public class ShopRunner {
    public static void main(String[] args) {
        Shop vegetable = new Vegetableimpl();
        vegetable.business();


        Shop in = new Invest();
        in.sell();
        in.business();
    }

}
