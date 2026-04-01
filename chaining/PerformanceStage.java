class PerformanceStage extends Stage {

    double size;
    char rating;
    long audienceCount;

    PerformanceStage(int stageId, String stageName, boolean openAir,      double size, char rating, long audienceCount) 
	{
        super(stageId, stageName, openAir);
        this.size = size;
        this.rating = rating;
        this.audienceCount = audienceCount;
    }

    void display() {
        System.out.println("Stage ID: " + stageId);
        System.out.println("Stage Name: " + stageName);
        System.out.println("Open Air: " + openAir);
        System.out.println("Size: " + size);
        System.out.println("Rating: " + rating);
        System.out.println("Audience Count: " + audienceCount);
        System.out.println("-----------");
    }
}