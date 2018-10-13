package com.anup.tddandroid.DTO;

/**
 * Created by anup on 10/13/18.
 */

public class TreeDTO extends PlantDTO{
    private int size;
    private String fallColor;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFallColor() {
        return fallColor;
    }

    public void setFallColor(String fallColor) {
        this.fallColor = fallColor;
    }

    @Override
    public String toString(){
        return "Tree : " + super.toString();
    }
}
