package com.hasnat.polymorphism;

public class MultimediaSystem {
    public static void main(String[] args) {
        // Creating an Image object with sample data
        Image image = new Image("Beautiful Sunset", 120, "1920x1080");
        System.out.println("Image Details:");
        image.getDetails();

        System.out.println();

        // Creating a Video object with sample data
        Video video = new Video("Nature Documentary", 3600, "MP4");
        System.out.println("Video Details:");
        video.getDetails();
    }
}
