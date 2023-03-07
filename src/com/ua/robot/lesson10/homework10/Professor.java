package com.ua.robot.lesson10.homework10;

public class Professor {
    private String name;
    private String surname;
    private String topic;
    private String position;
    private int salary;

    public Professor(String name, String surname, String topic, String position, int salary) {
        this.name = name;
        this.surname = surname;
        this.topic = topic;
        this.position = position;
        this.salary = salary;

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

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

      @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", topic='" + topic + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

}
