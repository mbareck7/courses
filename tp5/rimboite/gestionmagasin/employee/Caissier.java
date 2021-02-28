package tp5.rimboite.gestionmagasin.employee;

public class Caissier extends Employee{
    private int numeroDeCaisse;



    
    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }
    

    public String toString(){
        return super.toString() + "numDeCaisse :" + getNumeroDeCaisse();
    }

    // public Caissier(int id, String nom, String address, float nbr_heures, int numeroDeCaisse) {
    //     super(id, nom, address, nbr_heures);
    //     this.numeroDeCaisse = numeroDeCaisse;
    // }




    public float salaire(){
        float s = 0.0f,ss,sFinal = 0.0f;
        if(this.getNbr_heures() <= 180){
            s = 10 * this.getNbr_heures();
            return s;
        }
        else{
            int numSuplementaire = this.getNbr_heures() - 180;
            s = 10 * 180;
            ss = numSuplementaire * 10;
            ss *= 0.15;

            sFinal = s + ss;
            return sFinal;
        }
    }
}


