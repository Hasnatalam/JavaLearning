
//CO -VARIENT

package com.hasnat.polymorphism;

public class Video extends Media {
    private String format;

    public Video(String title, int duration, String format) {
        super(title, duration);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public Video getDetails() {
        super.getDetails();
        System.out.println("Format: " + format);
        return this;
    }
}
