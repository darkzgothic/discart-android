package com.zahidhasan.discart.model;

/**
 * Created by auuntoo on 3/5/18.
 */

public class Photo {
    private String link;
    private int image;

    public Photo(String link, int image) {
        this.link = link;
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Photo() {

    }
}
