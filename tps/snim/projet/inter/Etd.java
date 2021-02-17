package tps.snim.projet.inter;

public class Etd extends Personne{
    private String mat;

    public Etd(String mt,String nom){
        this.mat =mt;
        this.setNom(nom);
    }



    public String showInfo(){
        return super.showInfo() + this.mat;
    }
}



