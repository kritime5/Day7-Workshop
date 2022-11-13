package com.bridgz;

public class StudentEncpEx {
    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public void setEnrollmentNo(int enrollmentNo) {
        this.enrollmentNo = enrollmentNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private int enrollmentNo;
    private int marks;
    private String subject;

    public StudentEncpEx(int enrollmentNo, int marks, String subject) {
        this.enrollmentNo = enrollmentNo;
        this.marks = marks;
        this.subject = subject;
    }




}
