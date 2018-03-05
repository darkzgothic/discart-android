package com.zahidhasan.discart.model;

/**
 * Created by auuntoo on 2/28/18.
 */

public class Category {

    private String title;
    private int image;

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

    public Category(String title) {

        this.title = title;
    }

    public Category(String title, int image) {

        this.title = title;
        this.image = image;
    }
}
