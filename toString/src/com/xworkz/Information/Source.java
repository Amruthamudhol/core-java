package com.xworkz.Information;

public class Source {
    String sourceName;
    int sourceId;

    Source(String sourceName, int sourceId) {
        this.sourceName = sourceName;
        this.sourceId = sourceId;
    }

    @Override
    public String toString() {
        return "Source [sourceName=" + sourceName + ", sourceId=" + sourceId + "]";
    }
}
