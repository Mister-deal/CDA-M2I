package org.example.exercices.poo_exercices;

public class Person {


    protected int age;

    public void getBonjour(){
        System.out.println("hello!");
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setting age to" + age + " years old");
    }
}
