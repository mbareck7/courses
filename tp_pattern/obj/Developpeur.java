/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_pattern.obj;

public class Developpeur {
    private String nom;
    private String id;
    private Langage lang = new Langage(); 
    
    public Developpeur(String nom, String id)
    {
        this.nom=nom;
        this.id=id;
    }
    public void setNom(String newname)
        {
           this.nom=newname;
        }
        public String getNom()
            {
               return this.nom;
            }
    public void setId(String newId)
    {
        this.id=newId;
    }
    public String getId()
    {
        return this.id;
    }
    public void setlang(Langage newlangage) 
    {
        this.lang=newlangage;
    }
    public Langage getlang()
    {
        return this.lang;
    }

    public void toStringDev() {
        System.out.println("Developpeur : nom=" + nom + "  id=" + id );
        lang.toStringLang();
    }
}