package org.example.exercices.poo_exercices;

public class main {

    //création d'une méthode afin d'afficher les éléments en l'appelant
    public static void toString(Chaise chaise) {
        System.out.println("Je suis une Chaise, avec " + chaise.getPied_chaise() +
                " pieds en" + chaise.getMateriaux() +
                " et de couleurs " + chaise.getCouleurs() );
    }

    public static void main(String[] args){


        //création d'éléments grâce à la classe Chaise

        Chaise a = new Chaise(4, " en bois", "marron");
        //appels de la fonction toString
        toString(a);
        Chaise b = new Chaise(4, " en acier", "anthracite");
        toString(b);
        Chaise c = new Chaise(1, " en plexiglas", "blanche");
        toString(c);
        Chaise d = new Chaise(3, " en acier", "noir onyx");
        toString(d);
        //création d'une personne avec la classe Person
        Person child = new Person(15);
        //utilisation de la fonction getBonjour pour y afficher une salutation dans l'invite de commande
        child.getBonjour();

        //création d'un élève avec la classe Student, classe enfant de Person
        Student student = new Student(15);
        //utilisation de nombreuses fonctions permettant d'afficher de nombreuses lignes de texte, ainsi que l'âge de l'élève


        student.goToClasses();
        student.getBonjour();
        student.goToClasses();
        student.displayAge();

        //même chose qu'en haut, mais avec l'utilisation d'une classe Teacher
        Teacher teacher = new Teacher(40);
        teacher.getBonjour();
        teacher.displayAge();
        teacher.explaining();
        teacher.setSubject("math");



    }
}
