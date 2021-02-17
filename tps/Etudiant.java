package tps;

public class Etudiant {
    public String mat;
    public String spc;

    public Etudiant(String mat){
        this.mat = mat;
    }

    public Etudiant(String mat, String spce){
        this.mat = mat;
        this.spc = spce;
    }


public static void main(String[] args) {
    // System.out.println("test");
    Etudiant e1 = new Etudiant("94834u","INfo");

    System.out.println(e1.mat);

    
}
}