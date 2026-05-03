package com.xworkz.camera;

public class CameraImpl implements Camera {
    public void capturePhoto() {
        System.out.println("Camera captured photo");
    }

    public void recordVideo() {
        System.out.println("Camera is recording video");
    }

    public void deletePhoto() {
        System.out.println("Photo deleted");
    }
}
