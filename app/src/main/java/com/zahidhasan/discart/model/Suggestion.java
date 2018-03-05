package com.zahidhasan.discart.model;

/**
 * Created by auuntoo on 3/1/18.
 */

public class Suggestion {
    private String title;
    private int image;

    public Suggestion() {
    }

    public Suggestion(String title, int image) {

        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
