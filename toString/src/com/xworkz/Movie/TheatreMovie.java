package com.xworkz.Movie;

public class TheatreMovie extends Movie {
    int screenCount;     // Extra variable 1
    boolean is3DFormat;  // Extra variable 2

    public TheatreMovie(String projectName, long boxOfficeCollection, float ratingScore, char certificateType, String[] artistNames, FilmCategory category, Producer productionHead, int screenCount, boolean is3DFormat) {
        super(projectName, boxOfficeCollection, ratingScore, certificateType, artistNames, category, productionHead);
        this.screenCount = screenCount;
        this.is3DFormat = is3DFormat;
    }

    // Override Method 1
    @Override
    public void startShow() {
        System.out.println("Theatre screening started for: " + projectName);
    }

    // Override Method 2
    @Override
    public void displayCollection() {
        System.out.println("Theatre collection is booming!");
    }

    // Override Method 3
    @Override
    public String toString() {
        return "TheatreMovie [projectName=" + projectName +
                ", boxOfficeCollection=" + boxOfficeCollection +
                ", ratingScore=" + ratingScore +
                ", certificateType=" + certificateType +
                ", category=" + category +
                ", productionHead=" + productionHead +
                ", screenCount=" + screenCount +
                ", is3DFormat=" + is3DFormat + "]";
    }
}
