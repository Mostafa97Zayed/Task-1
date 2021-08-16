package com.OOP;

import java.util.List;

public class Class {

    private List<Teacher> teachers;

    private List<Student> students;

    private List<Table> tables;

    public Class() {
    }

    public Class(List<Teacher> teachers, List<Student> students, List<Table> tables) {
        this.teachers = teachers;
        this.students = students;
        this.tables = tables;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
}
