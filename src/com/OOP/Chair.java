package com.OOP;

public class Chair {

    private String colour;
    private Student student;

    public Chair() {
    }

    public Chair(String colour, Student student) {
        this.colour = colour;
        this.student = student;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
