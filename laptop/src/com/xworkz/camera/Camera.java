package com.xworkz.camera;

public interface Camera {
    String model = "Sony";
    int zoom = 50;

    void capturePhoto();
    void recordVideo();
    void deletePhoto();
}
