package com.ua.robot.lesson10.homework10;

public class Student {
    private String name;
    private String surname;
    private int course;
    private String faculty;

    public Student(String name, String surname, int course, String faculty) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
