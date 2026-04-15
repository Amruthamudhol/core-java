package com.xworkz.Information;

public class Information {
    int infoId;
    String infoTitle;
    String[] keywords;
    InfoType type;
    Source source;

    Information(int infoId, String infoTitle, String[] keywords,
                InfoType type, Source source) {

        this.infoId = infoId;
        this.infoTitle = infoTitle;
        this.keywords = keywords;
        this.type = type;
        this.source = source;
    }

    public void displayInfo() {
        System.out.println("Information: " + infoTitle);
    }

    public void showId() {
        System.out.println("ID: " + infoId);
    }

    @Override
    public String toString() {
        return "Information [infoId=" + infoId +
                ", infoTitle=" + infoTitle +
                ", type=" + type +
                ", source=" + source + "]";
    }
}
