package com.xworkz.camera;

public class CameraRunner {
    public static void main(String[] args) {
        CameraImpl camera = new CameraImpl();

        camera.capturePhoto();
        camera.recordVideo();
        camera.deletePhoto();

        System.out.println(Camera.model);
        System.out.println(Camera.zoom);
    }
}
