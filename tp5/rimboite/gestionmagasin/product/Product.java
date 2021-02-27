package tp5.rimboite.gestionmagasin.product;

import java.util.Date;

public class Product {
    
     private int id;
     private String libelle;
     private String marque;
     private float prix;
     private String type;
     private Date date;
     
    public String determinerTypeProduit(){//4
        if(this.type.equals("Fruit"))
            return "Fruit";
        return  "Ligume";
    }


     public Product(){

     }



     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getLibelle() {
         return libelle;
     }

     public void setLibelle(String libelle) {
         this.libelle = libelle;
     }

     public String getMarque() {
         return marque;
     }

     public void setMarque(String marque) {
         this.marque = marque;
     }

     public float getPrix() {
         return prix;
     }

     public void setPrix(float prix) {
         if(prix < 0)
         System.out.println("Prix < 0");
         else
            this.prix = prix;
     }


     
     public Product(int id, String libelle, String marque, float prix) {
         if(prix < 0)
            System.out.println("Prix < 0");
            else{
                this.id = id;
                this.libelle = libelle;
                this.marque = marque;
                this.prix = prix;
            }     
     }

     public Product(int id, String libelle) {
         this.id = id;
         this.libelle = libelle;
     }

     public Product(int id, String libelle,String type,String marque) {
        this.id = id;
        this.libelle = libelle;
        this.type = type;
        this.marque = marque;
    }

     public String getType() {
         return type;
     }

     public void setType(String type) {
         this.type = type;
     }

     public Product(int id, String libelle, String marque) {
         this.id = id;
         this.libelle = libelle;
         this.marque = marque;
     }

     
     public void afficher() {
         System.out.println( "Product [id=" + id + ", libelle=" + libelle + ", marque=" + marque + ", prix=" + prix + ", type="
                 + type + "]");
     }

     public Date getDate() {
         return date;
     }

     public void setDate(Date date) {
         this.date = date;
     }



     
}