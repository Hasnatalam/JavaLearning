package com.hasnat.polymorphism;

public class Media {
    private String title;
    private int duration;

    public Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Media getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " seconds");
        return this;
    }
}












