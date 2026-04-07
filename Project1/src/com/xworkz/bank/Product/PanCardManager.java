package com.xworkz.bank.Product;

public class PanCardManager {
    PanCard[] cardList = new PanCard[5];
    int position;

    void storeCard(PanCard card) {
        if (card != null && cardList != null) {
            if (position < this.cardList.length) {
                cardList[position] = card;
                System.out.print("PanCard stored at " + position + " -> ");
                card.info();
                System.out.println("~~~~~~~~~");
                position++;
            } else {
                System.out.println("No space available");
            }

        } else {
            System.out.println("Card object is null");
        }
    }

    boolean searchByPanId(String searchPan) {
        System.out.println("searchByPanId");

        if (this.cardList != null) {
            for (PanCard card : this.cardList) {
                if (card != null && card.panId == searchPan) {

                    System.out.println(">>> Match Found <<<");
                    card.info();
                    return true;
                }
            }
        }

        System.out.println("No record found");
        return false;
    }

    boolean updateCityByPan(String searchPan, String newCity) {

        System.out.println("~~~~~~~~~");
        System.out.println("updateCityByPan");

        if (this.cardList != null) {
            for (PanCard card : this.cardList) {
                if (card != null && card.panId == searchPan) {
                    card.city = newCity;

                    System.out.println("Updated City : " + card.city);
                    return true;
                }
            }
        }

        return false;
    }

}
