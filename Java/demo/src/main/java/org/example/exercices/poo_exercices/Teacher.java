package org.example.exercices.poo_exercices;

public class Teacher extends Person {

    private String subject;

    public Teacher(int age) {
        super(age);
    }

    public void explaining(){
        System.out.println("i'm explaining and making sure that my students learn from me.");
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void displayAge(){
        System.out.println("i'm " + getAge() + " years old.");
    }

}
