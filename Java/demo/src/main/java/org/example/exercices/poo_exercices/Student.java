package org.example.exercices.poo_exercices;

public class Student extends Person {

    public Student(int age) {
        super(age);
    }

    public void goToClasses(){
        System.out.println("i'm going to class.");
    }



    public void displayAge(){
        System.out.println("i'm " + getAge() + " years old.");
    }
}
