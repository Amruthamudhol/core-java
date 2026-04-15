package com.xworkz.Information;

public class DigitalInformation extends Information{
    boolean isOnline;
    int dataSize;

    DigitalInformation(int infoId, String infoTitle, String[] keywords,
                       InfoType type, Source source,
                       boolean isOnline, int dataSize) {

        super(infoId, infoTitle, keywords, type, source);
        this.isOnline = isOnline;
        this.dataSize = dataSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying digital info: " + infoTitle);
    }

    @Override
    public void showId() {
        System.out.println("Digital Info ID: " + infoId);
    }

    @Override
    public String toString() {
        return "DigitalInformation [infoId=" + infoId +
                ", infoTitle=" + infoTitle +
                ", type=" + type +
                ", source=" + source +
                ", isOnline=" + isOnline +
                ", dataSize=" + dataSize + "]";
    }
}
