package org.lessons.java.snacks;

import java.util.ArrayList;

public class StudentsList {
    private ArrayList<Student> students;

    // constructor
    public StudentsList() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void getStudents() {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.println(s);
        }
    }
}
