package org.example.exercices.poo_exercices;

public class main {


    public static void toString(Chaise chaise) {
        System.out.println("Je suis une Chaise, avec " + chaise.getPied_chaise() +
                " pieds en" + chaise.getMateriaux() +
                " et de couleurs " + chaise.getCouleurs() );
    }

    public static void main(String[] args){



        Chaise a = new Chaise(4, " en bois", "marron");
        toString(a);
        Chaise b = new Chaise(4, " en acier", "anthracite");
        toString(b);
        Chaise c = new Chaise(1, " en plexiglas", "blanche");
        toString(c);
        Chaise d = new Chaise(3, " en acier", "noir onyx");
        toString(d);

        Person child = new Person(15);
        child.getBonjour();

        Student student = new Student(15);
        student.goToClasses();
        student.getBonjour();
        student.goToClasses();
        student.displayAge();


        Teacher teacher = new Teacher(40);
        teacher.getBonjour();
        teacher.displayAge();
        teacher.explaining();
        teacher.setSubject("math");



    }
}
