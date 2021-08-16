package com.OOP;

public class Normal extends Student {

    private String GPA;

    public Normal() {
    }

    public Normal(String GPA) {
        this.GPA = GPA;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }
}
