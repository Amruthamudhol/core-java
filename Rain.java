class Rain {

    String type;
    double intensity;
    String season;
    double duration;
    boolean isHeavy;

    Rain() {
        System.out.println("Constructor 1: Default");
    }

    Rain(String type) {
        this.type = type;
    }
	
    Rain(String type, double intensity) {
        this.type = type;
        this.intensity = intensity;
    }

    Rain(String type, double intensity, String season) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
    }

    Rain(String type, double intensity, String season, double duration) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.duration = duration;
    }

    Rain(String type, double intensity, String season, double duration, boolean isHeavy) {
        this.type = type;
        this.intensity = intensity;
        this.season = season;
        this.duration = duration;
        this.isHeavy = isHeavy;
    }
}