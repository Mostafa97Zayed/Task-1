package com.OOP;

public class Teacher {

    private Long id;
    private String name;
    private int age;
    private Subject subject;

    public Teacher() {
    }

    public Teacher(Long id, String name, int age, Subject subject) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
