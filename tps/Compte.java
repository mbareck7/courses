package tps;

public class Compte {
    private final long numCompte;
    private String nomTitulaire;
    private static long n =0;
    private double sold = 0;//can be < 0
    private double decouvert;// ==0 if sold > 0 , = |sold| if sold <0
    private double moins;//=max decouvert
    private double debitMax;
    private boolean status;



public double convertToEuro(double montant){
    return montant/428;
}

public Compte(long numCompte){
    this.numCompte = numCompte;
}


public Compte(String nomTitulaire,long numCompte){
    this.numCompte = numCompte;
    this.nomTitulaire = nomTitulaire;
    this.decouvert = 800;
    this.debitMax = 1000;
}



public Compte(String nomTitulaire,double sold,long numCompte){
    this.numCompte  = numCompte;
    this.nomTitulaire = nomTitulaire;
    this.decouvert = 800;
    this.debitMax = 1000;
    this.sold = sold;
}

public Compte(String nomTitulaire, double sold, double moins, double debitMax,long numCompte) {
    this.nomTitulaire = nomTitulaire;
    this.sold = sold;
    this.numCompte = numCompte;
    this.moins = moins;
    this.debitMax = debitMax;
    this.n +=1;
}


//functions
public void crediter(double montant){
    this.sold += Math.abs(montant);
}

public boolean debiter(double montant){

    if (montant > this.debitMax)
        return false;
    if (this.sold - Math.abs(montant) >= this.moins){
        this.sold -= Math.abs(montant);
        return true;
    }
    return false;
}

public boolean virement(Compte c1, double montant){
    //from  this to c1 
    if(this.debiter(montant)){
        c1.crediter(montant);
        return true;
    }
    return false;
}


    @Override
    public String toString() {
        return "Compte \ndebitMax=" + debitMax + "\n decouvert=" + decouvert + "\n moins=" + moins + "\nnomTitulaire="
                + nomTitulaire + "\nsold=" + this.convertToEuro(sold) + " Euro" + "\n status=" + status;
    }







    
    public static void main(String[] args) {
        Compte c1 = new Compte("Ahmed",1000);
        Compte c2 = new Compte("Fatma",50000,5000,6000,getN()+1);
        
       System.out.println(c1.toString());
       System.out.println(c2.toString());

       c1.debiter(300);
       c2.debiter(600);
       c1.crediter(500);

       System.out.println(c1.toString());
       System.out.println(c2.toString());

       c2.virement(c1, 1000);

       System.out.println(c1.toString());
       System.out.println(c2.toString());

    }

    public long getNumCompte() {
        return numCompte;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public static long getN() {
        return n;
    }

    public static void setN(long n) {
        Compte.n = n;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public double getMoins() {
        return moins;
    }

    public void setMoins(double moins) {
        this.moins = moins;
    }

    public double getDebitMax() {
        return debitMax;
    }

    public void setDebitMax(double debitMax) {
        this.debitMax = debitMax;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}