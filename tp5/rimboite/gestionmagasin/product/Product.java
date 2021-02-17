package tp5.rimboite.gestionmagasin.product;

public class Product {
    
     private int id;
     private String libelle;
     private String marque;
     private float prix;

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
}
