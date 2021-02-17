package courses.heritage.peopels;

public class Personne { 

    String nom; 
    long cin;

    public Personne(String nom, long cin){
        this.nom = nom;
        this.cin = cin;
    }
    

    public void info(){
        System.out.println("I'm a Person");
    }

    public void show(){//surcharge
        System.out.println("Show from person");
    }

    public void setNom(String nom){
        this.nom=nom;}
    
    public String getNom(){
        return nom;}
    
    public void setCin(long cin){
        this.cin=cin;}
    
    public long getCin(){
        return cin;}
}