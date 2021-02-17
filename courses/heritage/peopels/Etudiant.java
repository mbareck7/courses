package courses.heritage.peopels;

public class Etudiant extends Personne {

    float moyenne;

    public Etudiant(String nom,long cin){
        super(nom, cin);
    }

    public void info(){
        System.out.println("I'm a student");
        super.info();
    }
    
    // public void show(String msg){//surcharge
    //     super.show();
    //     System.out.println("Show from Etudiant " + msg);
    // }

    public void setMoyenne(float moyenne){
          this.moyenne=moyenne;}
    
    public float getMoyenne (){
        return moyenne;}
} 