/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pattern.obj;
import java.util.ArrayList;
import java.util.List;

 
public class Societe {
    private String id;
    private String nom; 
    private List<Developpeur> listDevellopeur = new ArrayList<>();
    
    public Societe(String id, String nom)
    {
       this.id=id;
       this.nom=nom;  
    }
    public void setNom(String newname)
    {
        this.nom=newname;
       
    }
    public String getNom()
    {
        return nom;
    }
    public void setId(String newid)
    {
        this.id=newid;
    }
    public String getId()
    {
        return id;
    }

    public List<Developpeur> getListDevellopeur(){
        return this.listDevellopeur;
    }
    
    public void setListDevellopeur(List<Developpeur> developers){
        this.listDevellopeur = developers;
    
    }  
    
    
    
    
    
    public void toStringSoc()
    {
        
        String results =  "id ="+this.id +" nom = "+this.nom ; 
        
//        for (Developpeur dev : listDevellopeur){
//            results += dev.toStringDev();
//        }
        
        
             
        System.out.println(results);
    }
    
    
    public void  addDev(Developpeur d)
    {
        listDevellopeur.add(d);
    }
    
    public Developpeur getDev(int indice)
    {
        return  (Developpeur) listDevellopeur.get(indice);
    }    
}
