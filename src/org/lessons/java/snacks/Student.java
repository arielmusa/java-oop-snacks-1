package org.lessons.java.snacks;

public class Student {
    private String name;
    private String surname;
    private int age;

    // costruttore
    public Student(String name,String surname,int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // get/set name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //get/set surname

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // get/set age

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String studentData() {
        return name + " " + surname + ", " + age + " anni";
    }
}
