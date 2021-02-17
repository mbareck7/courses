package snim.projet.inter;

import java.util.Date;

public class Personne implements Ipersone {
    private int id;
    private String nom;
    private String prenom;
    private String dateNais;
    private Double salaire;
    private Profile profile;//DG,ENG,TEC,SEC


    //on constate que notre IDE a affiche une erreur, car 
    //on a pas implemente les methodes definies dans l'interface Ipersone


    


    public void affiche() {
        if(this.profile.getLibelle().equals("DG")){
             String msg = "Je suis le directeur " +  this.nom  + "ne le " + this.dateNais + " et mon salaire est " + this.salaire + "UM";
             System.out.println(msg);
        }
        
        if(this.profile.getLibelle().equals("ENG")){
            String msg = "Je suis l’ingénieur, " +  this.nom  + "ne le " + this.dateNais + " et mon salaire est " + this.salaire + "UM";
            System.out.println(msg);
        }


       if(this.profile.getLibelle().equals("TEC")){
        String msg = "Je suis le technicien " +  this.nom  + "ne le " + this.dateNais + " et mon salaire est " + this.salaire + "UM";
        System.out.println(msg);
    }


   if(this.profile.getLibelle().equals("TEC")){
    String msg = "Je suis le secrétaire " +  this.nom  + "ne le " + this.dateNais + " et mon salaire est " + this.salaire + "UM";
    System.out.println(msg);
}

       
    }

    public double calculeSalaire() {
        
        switch (this.profile.getLibelle()) {
            case "DG":
                this.salaire *=1.2;
                break;
            case "ENG":
            this.salaire *=1.1;

            case "TEC":
            this.salaire *=1.05;

            case "SEC":
            this.salaire *=1.02;
        
            default:
                break;
        }

        return 0;
    }

    public Personne(int id, String nom, String prenom, String dateNais, Double salaire, Profile profile) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
        this.salaire = salaire;
        this.profile = profile;
    }





    // public int getId() {
    //     return id;
    // }

    // public void setId(int id) {
    //     this.id = id;
    // }

    // public String getNom() {
    //     return nom;
    // }

    // public void setNom(String nom) {
    //     this.nom = nom;
    // }

    // public String getPrenom() {
    //     return prenom;
    // }

    // public void setPrenom(String prenom) {
    //     this.prenom = prenom;
    // }

    // public Date getDateNais() {
    //     return dateNais;
    // }

    // public void setDateNais(Date dateNais) {
    //     this.dateNais = dateNais;
    // }

    // public Double getSalaire() {
    //     return salaire;
    // }

    // public void setSalaire(Double salaire) {
    //     this.salaire = salaire;
    // }

    
    // public String showInfo() {
    //     return "Personne nom= " + nom ;
    // }

    
    
}
