package com.xworkz.Movie;

public class Movie {
    String projectName;
    long boxOfficeCollection;
    float ratingScore;
    char certificateType;
    String[] artistNames;
    FilmCategory category;
    Producer productionHead;

    public Movie(String projectName, long boxOfficeCollection, float ratingScore, char certificateType, String[] artistNames, FilmCategory category, Producer productionHead) {
        this.projectName = projectName;
        this.boxOfficeCollection = boxOfficeCollection;
        this.ratingScore = ratingScore;
        this.certificateType = certificateType;
        this.artistNames = artistNames;
        this.category = category;
        this.productionHead = productionHead;
    }

    public void startShow() {
        System.out.println("Movie started: " + projectName);
    }


    public void displayCollection() {
        System.out.println("Collection: " + boxOfficeCollection);
    }

    @Override
    public String toString() {
        return "Movie [projectName=" + projectName +
                ", boxOfficeCollection=" + boxOfficeCollection +
                ", ratingScore=" + ratingScore +
                ", certificateType=" + certificateType +
                ", category=" + category +
                ", productionHead=" + productionHead + "]";
    }
}
