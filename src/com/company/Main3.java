package com.company;

public class Main3 {

    public static void main(String[] args) {
//        Task 2
        University[] university = new University[5];
        for (int i=0; i<university.length; i++) {
            university[i] = new University();
            university[i].setDepartment("department_" + i);
            university[i].setStudent("student_" + i);
            university[i].setLecture("lecture_" + i);
            System.out.println(university[i].print());
        }

//        Task 1
        for (int i=1; i<17; i++) {
            Student student = new Student("Student", "cybernetic");
            student.setName(student.getName() + "_" + i);
            System.out.println(student.getName() + " id is a " + Student.id);
        }
    }
}
