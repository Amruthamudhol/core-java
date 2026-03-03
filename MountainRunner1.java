class MountainRunner1 {

    public static void main(String[] args) {
        Mountain mountain1 = new Mountain();
        Mountain mountain2 = new Mountain();

        mountain1.standTall();
        mountain1.attractClimbers();
        mountain1.receiveRain();
        mountain1.receiveSnow();
        mountain1.supportAnimals();
        mountain1.supportPlants();
        mountain1.provideResources();
        mountain1.createWaterfalls();
        mountain1.blockClouds();
        mountain1.formCaves();
        mountain1.experienceWeatherChange();
        mountain1.allowHiking();
        mountain1.improveTourism();
        mountain1.influenceRainfall();
        mountain1.provideFreshAir();

        mountain2.standTall();
        mountain2.attractClimbers();
        mountain2.receiveRain();
        mountain2.receiveSnow();
        mountain2.supportAnimals();
        mountain2.supportPlants();
        mountain2.provideResources();
        mountain2.createWaterfalls();
        mountain2.blockClouds();
        mountain2.formCaves();
        mountain2.experienceWeatherChange();
        mountain2.allowHiking();
        mountain2.improveTourism();
        mountain2.influenceRainfall();
        mountain2.provideFreshAir();

        Mountain.showMountainName();
        Mountain.showHeight();
        Mountain.showLocation();
        Mountain.showType();
        Mountain.showFamousMountains();
    }
}