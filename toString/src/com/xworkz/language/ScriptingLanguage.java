package com.xworkz.language;

public class ScriptingLanguage extends Language{
    String runtimeType;
    boolean supportsAI;


    public ScriptingLanguage(String title, int usageIndex, double releaseVersion, String[] capabilitySet, Proficiency levelType, Developer creatorInfo, String runtimeType, boolean supportsAI)
    {
        super(title, usageIndex, releaseVersion, capabilitySet, levelType, creatorInfo);
        this.runtimeType = runtimeType;
        this.supportsAI = supportsAI;
    }

    @Override
    public void executeCode() {
        System.out.println(title + " runs scripts without compilation...");
    }


    @Override
    public void showDetails() {
        System.out.println("This scripting language is widely used.");
    }


    @Override
    public String toString() {
        return "ScriptingLanguage [title=" + title +
                ", usageIndex=" + usageIndex +
                ", releaseVersion=" + releaseVersion +
                ", levelType=" + levelType +
                ", creatorInfo=" + creatorInfo +
                ", runtimeType=" + runtimeType +
                ", supportsAI=" + supportsAI + "]";
    }
}
