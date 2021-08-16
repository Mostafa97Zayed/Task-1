package com.OOP;

public class Table {

    private Chair [] chairs = new Chair[2];
    private String colour;

    public Table() {
    }

    public Table(Chair[] chairs, String colour) {
        this.chairs = chairs;
        this.colour = colour;
    }

    public Chair[] getChairs() {
        return chairs;
    }

    public void setChairs(Chair[] chairs) {
        this.chairs = chairs;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
