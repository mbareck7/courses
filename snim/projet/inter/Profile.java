package snim.projet.inter;

public class Profile {
    private int id;
     private String code; 
    private String libelle;

    public Profile(String code,String lib){
        this.code = code;
        this.libelle = lib;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    
}
