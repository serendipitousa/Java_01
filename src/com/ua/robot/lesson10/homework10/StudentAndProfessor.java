package com.ua.robot.lesson10.homework10;

public class StudentAndProfessor {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 1, "Computer Science");
        System.out.println(student);

        Professor professor = new Professor("Serhiy", "Milovanov", "Computer Science", "Professor", 50000);
        System.out.println(professor);
    }
}
