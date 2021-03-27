/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pattern.obj;


public class Langage {
    
    
    private String id;
    private String nom;
    
    public Langage(String id, String nom)
    {
        this.id=id;
        this.nom=nom;
    }
    
    public Langage(){}
    public void setId(String newid)
    {
        this.id=newid;
    }
    public String getId()
    {
        return this.id;
    }
    public void setNom(String newname)
    {
        this.nom=newname;
    }
    public String getNom()
    {
        return this.nom;
    }

    public void toStringLang() {
       System.out.println( "Langage : " + "id=" + id + ", nom=" + nom + "\n");
    }    
}
