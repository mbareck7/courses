package tp5.rimboite.gestionmagasin.employee;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Responsable extends Employee{
    private float prime;

    public float getPrime() {
        return prime;
    }

    public void setPrime(float prime) {
        this.prime = prime;
    }


    public String toString(){
        return super.toString() + "prime :" + getPrime();
    }



    public float salaire(){
        float s = 0.0f,ss,sFinal = 0.0f;
        if(this.getNbr_heures() <= 160){
            s = 10 * this.getNbr_heures() + this.getPrime();
            return s;
        }
        else{
            int numSuplementaire = this.getNbr_heures() - 160;
            s = 10 * 160;
            ss = numSuplementaire * 10;
            ss *= 0.2;

            sFinal = s + ss + this.getPrime();
            return sFinal;
        }
    }
}
