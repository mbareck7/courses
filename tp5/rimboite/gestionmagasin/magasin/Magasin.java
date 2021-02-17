package tp5.rimboite.gestionmagasin.magasin;

import java.util.LinkedList;

import tp5.rimboite.gestionmagasin.product.*;

public class Magasin {

     private int id;
     private String address;
     private int capacite;
     private LinkedList<Product> produits;
     private  static LinkedList<Magasin> listStore;




     public boolean ajouterProduit(Product p){
         if(this.produits.size() < 50){
             produits.add(p);
             return true;
         }
          return false;  
     }

     public void afficheMagasin(){
         String str = "id : " + this.id + "\naddress : " + this.address + "\ncapacite : " + this.capacite;
         System.out.println(str);
         System.out.println("***Products***\n");
         for (Product product : produits) {
             System.out.println("libelle : " + product.getLibelle() + "prix : " + product.getPrix());
         }

        //  for(int i =0; i < produits.size();i++){
        //      produits.get(i).getPrix();
        //  }
     }


     public int allProductNumber(){
         int res = 0;//all products number
        for (Magasin magasin : listStore) {
            res+=magasin.produits.size();
        }
        return res;
     }

     public int comparer(Product p1, Product p2){
         if(p1.getId() == p2.getId())
             return 1;
        return -1;
     }

     public int ChercherProduit(Product p, Magasin m){
        if(m.produits.contains(p))
            return 1;
        return -1;
     }

     public int ChercherProduit(Product p){
        for (Magasin magasin : listStore) {
            if(magasin.produits.contains(p))
                return magasin.id;
        }
        return -1;
     }

     public boolean ajouterProduit2(Product p){
         if(produits.contains(p))
            return false;
        else
            return ajouterProduit(p);
     }


     public void deleteProduct(Product p){
         produits.remove(p);
     }

    public void showMaxMagasinProductNumber(Magasin m1, Magasin m2){
        int m1ProductNumber = m1.allProductNumber();
        int m2ProductNumber = m2.allProductNumber();
        if(m1ProductNumber > m2ProductNumber)
            m1.afficheMagasin();
        m2.afficheMagasin();
    }
}
