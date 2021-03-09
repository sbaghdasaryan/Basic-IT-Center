package com.company;

public class University {
    private String department;
    private String student;
    private String lecture;

    String print() {
        String res;
        return res = "department = " + getDepartment() + " , "
                + "student = " + getStudent()  + " , " + "lecture = " + getLecture();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }
}
