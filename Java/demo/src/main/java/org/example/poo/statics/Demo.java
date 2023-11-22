package org.example.poo.statics;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println(user);
        User user1 = new User("Jean-michel");
        System.out.println(user1);

        int counter = User.counter;

        Employee e = new Employee();
        System.out.println(e);

    }

}
