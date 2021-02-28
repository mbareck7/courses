package tp5;

import java.util.LinkedList;

import javax.sound.sampled.Port;

import tp5.rimboite.gestionmagasin.employee.Caissier;
import tp5.rimboite.gestionmagasin.employee.Employee;
import tp5.rimboite.gestionmagasin.employee.Responsable;
import tp5.rimboite.gestionmagasin.employee.Vendeur;
import tp5.rimboite.gestionmagasin.magasin.Magasin;
import tp5.rimboite.gestionmagasin.product.Product;
import tp5.rimboite.gestionmagasin.product.ProduitFruit;

public class MagasinTest {
    public static void main(String[] args) {
        //1
        Magasin a = new Magasin(10,"Bonprix","El Mina");
        Magasin b = new Magasin(20,"Monopirx","Earvagh Zein");

        //2

        //for a
        // Employee caissier1A = new Caissier(); // Caissier caissier1 = new Caissier();
        // Employee caissier2A = new Caissier();

        // Employee venduer1A = new Vendeur();
        // Employee responsable1A = new Responsable();

        // a.getEmployees().add(caissier1A);



        a.getEmployees().add(new Caissier());
        a.getEmployees().add(new Caissier());
        a.getEmployees().add(new Vendeur());
        a.getEmployees().add(new Responsable());

        //for b
        // Employee caissier1B = new Caissier();
        // Employee venduer1B = new Vendeur();
        // Employee venduer2B = new Vendeur();
        // Employee venduer3B = new Vendeur();
        // Employee responsable1B = new Responsable();

        b.getEmployees().add(new Caissier());
        b.getEmployees().add(new Vendeur());
        b.getEmployees().add(new Vendeur());
        b.getEmployees().add(new Vendeur());;
        b.getEmployees().add(new Responsable());


        //3

        // for (Employee employee : a.getEmployees()) {
        //     employee.toString();//null pointer exception !
        // }

        a.showMagasinEmployee();
        b.showMagasinEmployee();


        //4
        // Product p1 = new Product();
        // a.ajouterProduit2(p1);
        a.ajouterProduit2(new Product());
        a.ajouterProduit2(new Product());
        a.ajouterProduit2(new Product());



        b.ajouterProduit2(new Product());
        b.ajouterProduit2(new Product());
        b.ajouterProduit2(new Product());
        b.ajouterProduit2(new Product());


        //5

        a.afficheMagasin();
        a.showMagasinEmployee();
        b.afficheMagasin();
        b.showMagasinEmployee();


        //6



        //new part

        LinkedList<Product> products = new LinkedList<>();

        //marque = null
        products.add(new ProduitFruit(1254,"Fruit","Fraise",12.3f,"Mars",null));
        products.add(new ProduitFruit(1224,"Fruit","Pasteque",50f,"Juin",null));
        products.add(new ProduitFruit(7896,"Fruit","Mandarien",25.6f,"Decembre",null));
        products.add(new ProduitFruit(8521,"Legumes","Artichauts",14f,"Janvier",null));



        //3

        Magasin c = new Magasin(); 
        
        for (Product product : products) {
            c.ajouterProduit2(product);  
        }

        //4
        //done in class Product, line 15-17

        //5 calculStock in Magasin class

        //6

        //Le programme doit permettre à l’utilisateur de :
        
        Product pVide = new Product();

        Product p1 = new Product(1021,"Lait","Delice");
        Product p2 = new Product(2510,"Yaourt","Vitale");
        Product p3 = new Product(3250,"Tomate","Sicam",1.200f);

        pVide.afficher();p1.afficher();p2.afficher();p3.afficher();

        p2.setPrix(0.700f);
        pVide.afficher();p1.afficher();p2.afficher();p3.afficher();

        pVide.setPrix(3223);
        pVide.setLibelle("Computer");
        pVide.setMarque("RimSoft");
        pVide.setPrix(3234.2f);
        pVide.setType(null);


        p1.setPrix(3223);
        p1.setLibelle("bal lba");
        p1.setMarque("....");
        p1.setPrix(3234.2f);
        p1.setType("Fruit");

        //the same for p2 et p3
        pVide.afficher();p1.afficher();p2.afficher();p3.afficher();
        pVide.toString();p2.toString();p2.toString();p3.toString();

        System.out.println(p1.getDate());
        System.out.println(p2.getDate());
        System.out.println(p3.getDate());


        
    }
}