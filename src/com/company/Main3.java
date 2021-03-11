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
        Student student1 = new Student("Student1", "cybernetic");
        Student student2 = new Student("Student2", "cybernetic");
        Student student3 = new Student("Student3", "cybernetic");
        Student student4 = new Student("Student4", "cybernetic");

        System.out.println("Student_1 id is a " + student1.getId());
        System.out.println("Student_3 id is a " + student3.getId());
        System.out.println("Student_4 id is a " + student4.getId());
        System.out.println("Student_2 id is a " + student2.getId());
    }
}
