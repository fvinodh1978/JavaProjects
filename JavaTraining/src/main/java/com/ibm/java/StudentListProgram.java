package com.ibm.java;

import java.util.*;
class Student {
    
    private String studentName;
    private String studentAddress;
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentAddress() {
        return studentAddress;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    
    public void acceptdetails() {
        Scanner sc = new Scanner(System.in);
        setStudentName(sc.nextLine());
        setStudentAddress(sc.nextLine());
    }
    
    public void displaydetails() {
        System.out.println("Name: " + getStudentName() + ", Address: " + getStudentAddress());
    }
}

public class StudentListProgram {
    public static void main(String[] args) {
        ArrayList<Student> obj = new ArrayList<Student>();
        Student s = new Student();
        s.acceptdetails();
        obj.add(s);
        s = new Student();
        s.acceptdetails();
        obj.add(s);
        
        for(Student st : obj) {
            st.displaydetails();
        }
        
    }
}