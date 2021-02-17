package snim.projet.inter;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {



        // ArrayList<String> profiles = new ArrayList<>();

        // profiles.add("DR");
        // profiles.add("ENG");
        // profiles.add("TEC");
        // profiles.add("SEC");





    // public Personne(int id, String nom, String prenom, Date dateNais, Double salaire, Profile profile) {
    //     this.id = id;
    //     this.nom = nom;
    //     this.prenom = prenom;
    //     this.dateNais = dateNais;
    //     this.salaire = salaire;
    //     this.profile = profile;
    // }


        Personne p1 = new Personne(1,"Mohamed","Said","21-8-1995",700000.0,new Profile("43434","DG"));
        Personne p2 = new Personne(2,"Mbaba","Hassen","21-8-1976",10000000.0,new Profile("432434","ENG"));
        Personne p3 = new Personne(3,"Sidi","Med","1-9-1995",700000.0,new Profile("432434","TEC"));
        Personne p4 = new Personne(4,"Fatma","Abdi","21-8-1985",700000.0,new Profile("46734","SEC"));


        p1.affiche();
        p2.affiche();
        





    }
}
