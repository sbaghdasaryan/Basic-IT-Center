package com.company;

public class Student {
    public static int id;
    private int studentId;
    private String name, department;

    Student(String name, String department) {
        id++;
        studentId=id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return studentId;
    }
}
