package com.xworkz.language;

public class Language {
    String title;
    int usageIndex;
    double releaseVersion;
    String[] capabilitySet;
    Proficiency levelType;
    Developer creatorInfo;

    Language(String title, int usageIndex, double releaseVersion,
             String[] capabilitySet, Proficiency levelType, Developer creatorInfo) {

        this.title = title;
        this.usageIndex = usageIndex;
        this.releaseVersion = releaseVersion;
        this.capabilitySet = capabilitySet;
        this.levelType = levelType;
        this.creatorInfo = creatorInfo;
    }

    public void executeCode() {
        System.out.println(title + " is executing code...");
    }


    public void showDetails() {
        System.out.println("Usage Index: " + usageIndex);
    }

    @Override
    public String toString() {
        return "Language [title=" + title +
                ", usageIndex=" + usageIndex +
                ", releaseVersion=" + releaseVersion +
                ", levelType=" + levelType +
                ", creatorInfo=" + creatorInfo + "]";
    }
}
