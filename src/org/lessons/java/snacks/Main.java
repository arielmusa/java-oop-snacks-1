package org.lessons.java.snacks;

public class Main {
    public static void main(String[] args) {

        //student
        Student Ariel = new Student("Ariel", "Musa", 26);

        System.out.println( Ariel.studentData());
       
        // bank account
        BankAccount acc1 = new BankAccount(1309431304);

        acc1.deposit(100.50);

        acc1.withdraw(29.99);

        System.err.println(acc1.getBalance());

        // students list
        StudentsList class1 = new StudentsList();

        class1.addStudent(Ariel);

        class1.getStudents();



    }
}
