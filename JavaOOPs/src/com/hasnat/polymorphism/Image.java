package com.hasnat.polymorphism;

public class Image extends Media {
    private String resolution;

    public Image(String title, int duration, String resolution) {
        super(title, duration);
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public Image getDetails() {
        super.getDetails();
        System.out.println("Resolution: " + resolution);
        return this;
    }
}

