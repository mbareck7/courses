package tp5.rimboite.gestionmagasin.employee;

public class Vendeur extends Employee{
    private float tauxDeVente;

    public float getTauxDeVente() {
        return tauxDeVente;
    }
    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }


    public String toString(){
        return super.toString() + "tauxDeVente :" + getTauxDeVente();
    }



    public float salaire(){
        return 450 * (this.getTauxDeVente()/100);
    }
}
