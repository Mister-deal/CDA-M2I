package org.example.exercices.tp_papeterie;

import java.util.HashMap;

public abstract class Article {

    public static int cmpt = 1;
    private static HashMap<Integer, Article> bdd = new HashMap<>();
    private Integer id;

    {
        cmpt++;
    }

    public Article(int id) {
        this.id = cmpt;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        bdd.put(id, this);
    }

    public static Article getArticle(int id){
        return bdd.get(id);
    }

    public  static int nbArticleBdd(){
        return bdd.size();
    }

    public abstract String getName();

    public abstract double getPrice();

    @Override
    public String toString() {
        return "Article{" +
                "id =" + id +
                " nom =" + getName() +
                " Prix unitaire = " + getPrice() +
                '}';
    }
}
